import sys
while True:
    a = sys.stdin.readline().strip()
    if len(a) == 0:
        break
    count = 0
    for x in range(len(a)):
        if a[x].isupper():
            count = count + 1
    print (count)