import sys


def count7(t):
    count = -1
    for x in range(t+1):
        if '7' in str(x) or x % 7 == 0:
            count = count + 1
    return count


while True:
        t = sys.stdin.readline().strip()
        if len(t) == 0:
            break
        print(count7(int(t)))
