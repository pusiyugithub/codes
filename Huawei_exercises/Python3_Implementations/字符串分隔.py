import sys
while True:
    x = sys.stdin.readline().strip()
    y = sys.stdin.readline().strip()
    if len(x) == 0:
        break
    i = 0
    while len(x) > 8:
        a = x[i:i+8]
        x = x[i+8:]
        print (a)
    print(x[::-1].zfill(8)[::-1])
    i= 0
    while len(y) > 8:
        a = y[i:i+8]
        y = y[i+8:]
        print (a)
    print(y[::-1].zfill(8)[::-1])
        
