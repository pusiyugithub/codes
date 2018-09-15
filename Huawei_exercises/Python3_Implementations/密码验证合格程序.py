import sys

def checkTypes(password):
    upperIndex = 0
    lowerIndex = 0
    digitIndex = 0
    otherIndex = 0
    for x in password:
        if x.isupper():
            upperIndex = upperIndex + 1
            break
    for x in password:
        if x.islower():
            lowerIndex = lowerIndex + 1
            break
    for x in password:
        if x.isdigit():
            digitIndex = digitIndex + 1
            break
    for x in password:
        if not x.isalnum():
            otherIndex = otherIndex + 1
            break
    if upperIndex+ lowerIndex +digitIndex+otherIndex>=3:
        return True
    else:
        return False


def checkSubString(password):
    l = list()
    for x in range(len(password)-2):
        l.append(password[x:x+3])
    s = set(l)
    if len(l) == len(s):
        return True
    else:
        return False


while True:
    password = sys.stdin.readline().strip()
    if len(password) == 0:
        break
    if len(password)>8 and checkTypes(password) and checkSubString(password):
        print("OK")
    else:
        print("NG")

