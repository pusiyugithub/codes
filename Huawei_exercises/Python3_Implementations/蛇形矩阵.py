import sys
while True:
    n = sys.stdin.readline().strip()
    if len(n) == 0:
        break
    startValue = 0
    a = [[0]*int(n) for i in range(int(n))]
    for x in range(int(n)):
        for y in range(x, -1, -1):
            k = x - y
            startValue = startValue + 1
            a[y][k] = startValue
    for row in a:
        l = []
        for x in row:
            if x > 0:
                l.append(str(x))
        print(" ".join(l))