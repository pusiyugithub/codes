import sys


def encrypt(a):
    s = str()
    for x in range(len(a)):
        if a[x].islower() and a[x] is not "z":
            s = s + str(chr(ord(a[x])+1).upper())

        elif a[x] == "z":
            s = s + "A"
        elif a[x].isupper() and a[x] is not "Z":
            s = s + str(chr(ord(a[x])+1).lower())
        elif a[x] == "Z":
            s = s + "a"
        elif a[x].isdigit() and a[x] is not "9":
            s = s + chr(ord(a[x])+1)
        elif a[x] is "9":
            s = s + "0"
        else:
            s = s + a[x]
    return s


def unEncrypt(a):
    s = str()
    for x in range(len(a)):
        if a[x].islower() and a[x] is not "a":
            s = s + str(chr(ord(a[x])-1).upper())
        elif a[x] == "a":
            s = s + "Z"
        elif a[x].isupper() and a[x] is not "A":
            s = s + str(chr(ord(a[x]) - 1).lower())
        elif a[x] == "A":
            s = s + "z"
        elif a[x].isdigit() and a[x] is not "0":
            s = s + chr(ord(a[x])-1)
        elif a[x] is "0":
            s = s + "9"
        else:
            s = s + a[x]
    return s


while True:
    a = sys.stdin.readline().strip()
    b = sys.stdin.readline().strip()
    if len(a) == 0:
        break
    print(encrypt(a))
    print(unEncrypt(b))
