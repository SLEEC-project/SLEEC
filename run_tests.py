import subprocess
import os
import concurrent.futures

def remove_ext(filename):
    return os.path.splitext(filename)[0]

def compile(filenames):
    sleec = [os.path.join('src', f + '.sleec') for f in files]
    with open(os.path.join('log', 'compilation.log'), 'w+') as f:
        print('compiling')
        result = subprocess.run(['java', '-jar', jar, *sleec],
                                shell = True,
                                stdout = f,
                                stderr = f)
    return result.returncode == 0

def validate(filename):
    csp = os.path.join('src-gen', filename + '.csp')
    with open(os.path.join('log', filename + '.validation.log'), 'w+') as f:
        print(f'validating {filename}\n', end='')
        result = subprocess.run(['refines', '--typecheck', csp],
                                shell = True,
                                stdout = f,
                                stderr = f)
    return {'name': filename,
            'passed': result.returncode == 0}

os.chdir(os.path.dirname(__file__))
jar = os.path.abspath('sleec.jar')
assert(os.path.isfile(jar))
os.chdir('circus.robocalc.sleec.runtime')
if not os.path.exists('log'):
    os.mkdir('log')

files = [remove_ext(f) for f in os.listdir('src') if '.sleec' in f]

if not compile(files):
    print('compilation falied')
    exit(1)

print('------------------------------')

with concurrent.futures.ThreadPoolExecutor() as executor:
    futures = [executor.submit(validate, f) for f in files]

print('------------------------------')

validation_results = [f.result() for f in futures]
num_failed = 0
for r in validation_results:
    if r['passed']:
        print(r['name'], 'passed')
    else:
        num_failed += 1
        print(r['name'], 'failed')

print('------------------------------')

print(num_failed, 'tests failed')
exit(num_failed != 0)
