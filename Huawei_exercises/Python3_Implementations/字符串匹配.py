import sys
def func(a,b):
    for x in a:
        if b.count(x) == 0:
            return "false"
    return "true"
while True:
    a = sys.stdin.readline().strip()
    if len(a) == 0:
        break
    b = sys.stdin.readline().strip()
    print(func(a, b))
