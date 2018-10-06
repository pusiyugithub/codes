import sys
from collections import OrderedDict
while True:
    s = sys.stdin.readline().strip()
    if len(s) == 0:
        break
    d = OrderedDict()
    for x in s:
        if d.get(x) is None:
            d.setdefault(x, 1)
        else:
            d.update({x: d.get(x)+1})
    index = False
    for k, v in d.items():
        if v == 1:
            index = True
            print(k)
            break
    if not index:
        print("-1")
