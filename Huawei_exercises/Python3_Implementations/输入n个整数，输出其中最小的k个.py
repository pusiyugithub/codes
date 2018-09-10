import sys
while True:
    a = sys.stdin.readline().strip()
    b = sys.stdin.readline().strip()
    if len(a) == 0:
        break
    b = b.split(" ")
    for x in range(len(b)):
        b[x] = int(b[x])
    b.sort()
    s = ""
    for x in range(int(a.split(" ")[1])):
        s = s+str(b[x])+" "
    print (s.strip())

