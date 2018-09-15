import sys
while True:
    s = sys.stdin.readline().strip()
    if len(s) == 0:
        break
    firstNum = int(s)**2-int(s)+1
    l = list()
    for x in range(int(s)):
        l.append(str(firstNum))
        firstNum = firstNum + 2
    print ("+".join(l))