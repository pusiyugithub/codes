import sys
while True:
    a = sys.stdin.readline().strip()
    if len(a) == 0:
        break
    b = sys.stdin.readline().strip()
    a = a.upper()
    s = ''
    for x in a:
        if s.count(x) == 0:
            s = s+x
    alphabet = ''
    for x in range(26):
        alphabet = alphabet + chr(x+65)
    for x in s:
        alphabet = alphabet.replace(x, '')
    newAlphabet = s + alphabet
    result = ''
    for x in b:
        if x.isupper():
            result = result + newAlphabet[ord(x)-65]
        else:
            result = result + newAlphabet[ord(x.upper())-65].lower()
    print(result)
