import sys

def convertCharToInt(a):
    if a is "A" or a is "a":
        return 10
    elif a is "B" or a is "b":
        return 11
    elif a is "C" or a is "c":
        return 12
    elif a is "D" or a is "d":
        return 13
    elif a is "E" or a is "e":
        return 14
    elif a is "F" or a is "f":
        return 15
    else:
        return ord(a)-48


def convertIntToChar(a):
    if a is 10:
        return "A"
    elif a is 11:
        return "B"
    elif a is 12:
        return "C"
    elif a is 13:
        return "D"
    elif a is 14:
        return "E"
    elif a is 15:
        return "F"
    else:
        return chr(a+48)


def func(newS):
    result = ""
    for x in range(len(newS)):
        if 48<=ord(newS[x])<=57 or 65<=ord(newS[x])<=70 or 97<=ord(newS[x])<=102:
            result = result + convertIntToChar(int(bin(convertCharToInt(newS[x]))[2:].zfill(4)[::-1], 2))
        else:
            result = result + newS[x]
    return result


while True:
    s = sys.stdin.readline().strip()
    if len(s) == 0:
        break
    s = s.replace(" ", "")
    a = list()
    b = list()
    for x in range(len(s)):
        if x%2 == 0:
            a.append(s[x])
        else:
            b.append(s[x])
    a.sort()
    b.sort()
    newS = ""
    for x in range(int(len(s)/2)):
        newS = newS + a[x]
        newS = newS + b[x]
    if len(s)%2 is not 0:
        newS = newS + a[len(a)-1]
    print(func(newS))


