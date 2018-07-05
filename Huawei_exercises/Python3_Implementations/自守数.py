import sys


def calcAutomorphicNumbers(a):
    count = 0
    for x in range(a+1):
        if str(x) == str(x*x)[-len(str(x)):]:
            count = count+1
    return count


while True:
        t = sys.stdin.readline().strip()
        if len(t) == 0:
            break
        print(calcAutomorphicNumbers(int(t)))




