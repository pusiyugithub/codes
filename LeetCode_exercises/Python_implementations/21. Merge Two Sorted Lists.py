# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if l1 is None:
            return l2
        else:
            while l2 is not None:
                temp = l2
                l2 = l2.next
                temp.next = None
                if temp.val < l1.val:
                    temp.next = l1
                    l1 = temp
                elif temp.val == l1.val:
                    tempNext = l1.next
                    l1.next = temp
                    temp.next = tempNext
                else:
                    if l1.next is not None:
                        if temp.val<= l1.next.val:
                            tempNext = l1.next
                            l1.next = temp
                            temp.next = tempNext
                        else:
                            self.mergeTwoLists(l1.next, temp)
                    else:
                        tempNext = l1.next
                        l1.next = temp
                        temp.next = tempNext
            return l1
        