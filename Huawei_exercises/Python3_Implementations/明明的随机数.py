import sys
while True:
    t = sys.stdin.readline().strip()
    if len(t) == 0:
        break
    t = int(t)
    a = list()
    s = set()
    for x in range(t):
        a.append(int(sys.stdin.readline().strip()))
    s = set(a)
    a = list(s)
    a.sort()
    for x in a:
        print(x)
