import sys
while True:
    s = sys.stdin.readline()
    if len(s) == 0:
        break
    s = bin(int(s))
    print(len(s)-len(s.replace("1", "")))

