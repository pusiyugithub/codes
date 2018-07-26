import sys
while True:
        t = sys.stdin.readline().strip()
        if len(t) == 0:
            break
        a = list()
        for x in range(int(t)):
            a.append(sys.stdin.readline().strip())
        a.sort()
        for x in a:
            print(x)
        