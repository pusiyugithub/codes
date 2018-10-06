import sys
def isPrime(n):
    for x in range(2, n-1):
        if n%x == 0:
            return False
    return True
while True:
    s = sys.stdin.readline().strip()
    if len(s) == 0:
        break
    media = int(int(s)/2)
    for x in range(media-1):
        if isPrime(media-x) and isPrime(media+x):
            print(media-x)
            print(media+x)
            break