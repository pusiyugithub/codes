import sys
def isPrime(s):
    for x in range(2, s):
        if s%x==0:
            return False
    return True
while True:
    s = sys.stdin.readline().strip()
    if len(s) == 0:
        break
    result = list()
    s = int(s)
    index = 2
    while not isPrime(s):
        if s%index == 0:
            result.append(index)
            s = int(s/index)
            continue
        else:
            index = index + 1
            continue
    result.append(s)
    for x in range(len(result)):
        result[x] = str(result[x])
    result = " ".join(result)+" "
    print (result)