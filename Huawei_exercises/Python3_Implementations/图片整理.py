import sys
while True:
    t = sys.stdin.readline().strip()
    if len(t) == 0:
        break
    print(''.join(sorted(list(t))))
