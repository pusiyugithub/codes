# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        carry = 0
        value = 0
        result = ListNode(0)
        index = result
        while l1 is not None and l2 is not None:
            if l1.val+l2.val+carry > 9:
                value = l1.val+l2.val+carry-10
                carry = 1
            else:
                value = l1.val + l2.val + carry
                carry = 0
            node = ListNode(value)
            index.next = node
            index = index.next
            l1 = l1.next
            l2 = l2.next
        if l1 is None and l2 is None:
            if carry == 1:
                node = ListNode(1)
                index.next = node
            return result.next
        elif l1 is None:
            index.next = l2
        elif l2 is None:
            index.next = l1
        preIndex = index
        index = index.next
        while index is not None:
            if index.val+carry >9:
                index.val = index.val+carry-10
                carry = 1
            else:
                index.val = index.val+carry
                carry = 0
            preIndex = index
            index = index.next
        if carry == 1:
            preIndex.next = ListNode(1)
        return result.next
        