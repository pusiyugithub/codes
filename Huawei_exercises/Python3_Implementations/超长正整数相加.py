#!/usr/bin/python3
import sys
class AddTwoNumbers(object):
    def __init__(self, addend, augend):
        self.addend = addend
        self.augend = augend

    def getAddend(self):
        return self.addend
    

    def getAugend(self):
        return self.augend
    
    def addTwoNums(self):
        if(len(self.addend)>len(self.augend)):
            temp = self.addend
            self.addend = self.augend
            self.augend = temp
         
        self.addend = self.addend.zfill(len(self.augend))
        list1 = list(self.addend)
        list2 = list(self.augend)
        list1.reverse()
        list2.reverse()
        carry = 0
        result = list()
        
        for x in range(len(list1)):
            if(int(list1[x])+int(list2[x])+carry>=10):
                result.append(int(list1[x])+int(list2[x])+carry-10)
                carry = 1
            else:
                result.append(int(list1[x])+int(list2[x])+carry)
                carry = 0
        if(carry == 1):
            result.append(carry)
        result.reverse()
        s = ''.join([str(x) for x in result])
        print(s)
       


while True:
    addend = sys.stdin.readline().strip()
    augend = sys.stdin.readline().strip()
    if len(addend) == 0:
        break
    x = AddTwoNumbers(addend, augend)
    x.addTwoNums()