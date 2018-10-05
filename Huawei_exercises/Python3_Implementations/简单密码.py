import sys

def convert(x):
    if x.islower():
        if x == 'a' or x == 'b' or x =='c':
            return '2'
        elif x == 'd' or x =='e' or x =='f':
            return '3'
        elif x == 'g' or x =='h' or x =='i':
            return '4'
        elif x == 'j' or x =='k' or x =='l':
            return '5'
        elif x == 'm' or x =='n' or x =='o':
            return '6'
        elif x == 'p' or x == 'q' or x == 'r' or x == 's':
            return '7'
        elif x == 't' or x =='u' or x =='v':
            return '8'
        elif x == 'w' or x == 'x' or x == 'y' or x == 'z':
            return '9'
    elif x.isupper():
        if x != 'Z':
            return chr(ord(x.lower())+1)
        else:
            return 'a'
    else:
        return x

while True:
    s = sys.stdin.readline().strip()
    if len(s) == 0:
        break
    result = ""
    for x in s:
        result = result + convert(x)
    print(result)

