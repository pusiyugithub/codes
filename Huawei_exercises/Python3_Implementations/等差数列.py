import sys
while True:
        t = sys.stdin.readline().strip()
        if len(t) == 0:
            break
        print(int(2 * int(t) + int(t) * (int(t) - 1) * 3 / 2))
