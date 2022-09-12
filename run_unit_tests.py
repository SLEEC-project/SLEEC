import os
import subprocess
import time
import re

def getMethodNames(filename):
    
    os.chdir('src/circus/robocalc/sleec/tests')
    text_file = open(filename)
    data = text_file.read()
    text_file.close()
    
    methodnames = re.findall(r'test_\w+', data)
    return methodnames


def runTest(methodname):

    print('\n--------------------------------------\n')
    
    with open(os.path.join('log', methodname + '.log'), 'w+') as f:
        print('Running ' + methodname + '...')
        cmd = 'mvn clean test -DTest=' + methodname
        result = subprocess.run(cmd, shell=True, stdout = f, stderr = f)
        return result.returncode == 0


def main():
    start = time.time()
    os.chdir('circus.robocalc.sleec.tests')
    if not os.path.exists('log'):
        os.mkdir('log')    
    
    for f in os.listdir('src/circus/robocalc/sleec/tests'):
        methodnames = getMethodNames(f)
        os.chdir('../../../../..')
        for m in methodnames:
            result = runTest(m)
            if not result:
                print(m + ' failed.')
            else:
                print(m + ' passed.')    
            

if __name__ == '__main__':
    main()
