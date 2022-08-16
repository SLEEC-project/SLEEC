import subprocess
import os
import concurrent.futures

def remove_ext(filename):
    return os.path.splitext(filename)[0]

def test(filename):
    generated = False
    validated = False
    filename = remove_ext(filename)
    sleec = os.path.join('src', filename + '.sleec')
    csp = os.path.join('src-gen', filename + '.csp')

    print(f'testing {filename}.sleec\n', end='')
    
    with open(os.path.join('log', filename + '.compilation.log'), 'w+') as f:
        result = subprocess.run(['java', '-jar', jar, sleec],
                                shell = True,
                                stdout = f,
                                stderr = f)
    
    if(result.returncode == 0):
        generated = True
        with open(os.path.join('log', filename + '.validation.log'), 'w+') as f:
            result = subprocess.run(['refines', '--typecheck', csp],
                                    shell = True,
                                    stdout = f,
                                    stderr = f)
        if(result.returncode == 0):
            validated = True
    
    return {'name': filename + '.sleec',
            'generated': generated,
            'validated': validated}

os.chdir(os.path.dirname(__file__))
jar = os.path.abspath('sleec.jar')
assert(os.path.isfile(jar))
os.chdir('circus.robocalc.sleec.runtime')
if not os.path.exists('log'):
    os.mkdir('log')

files = []
for f in os.listdir('src'):
    if '.sleec' in f:
        files.append(remove_ext(f))

results = []
with concurrent.futures.ThreadPoolExecutor() as executor:
    futures = [executor.submit(test, f) for f in files]
for f in futures:
    results.append(f.result())

failed = 0
print('------------------------------')
for r in results:
    if r['validated']:
        print(r['name'], 'passed')
    else:
        failed += 1
        if['generated']:
            print(r['name'], 'failed validation')
        else:
            print(r['name'], 'falied compilation')
print('------------------------------')
print(failed, 'tests failed')

exit(failed != 0)
