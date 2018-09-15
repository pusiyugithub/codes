import sys
while True:
    firstNum = sys.stdin.readline().strip()
    if len(firstNum) == 0:
        break
    firstLine = sys.stdin.readline().strip().split(" ")
    secondNum = sys.stdin.readline().strip()
    secondLine = sys.stdin.readline().strip().split(" ")
    s = set()
    for x in range(int(firstNum)):
        s.add(int(firstLine[x]))
    for x in range(int(secondNum)):
        s.add(int(secondLine[x]))
    s = list(s)
    s.sort()
    for x in range(len(s)):
        s[x] = str(s[x])
    print ("".join(s))