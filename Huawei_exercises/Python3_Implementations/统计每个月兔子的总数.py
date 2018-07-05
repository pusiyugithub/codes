import sys


def func(a):
    if a == 0:
        return 0
    elif a == 1:
        return 1
    else:
        return func(a-2)+func(a-1)


while True:
        t = sys.stdin.readline().strip()
        if len(t) == 0:
            break
        print((func(int(t))))



