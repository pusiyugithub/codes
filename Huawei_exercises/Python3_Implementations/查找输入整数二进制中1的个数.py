import sys
while True:
    s = sys.stdin.readline().strip()
    if len(s) == 0:
        break
    print (bin(int(s)).count("1"))