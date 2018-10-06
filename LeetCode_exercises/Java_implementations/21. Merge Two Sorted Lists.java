/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        else {
            while (l2!= null){
                ListNode temp = l2;
                l2 = l2.next;
                temp.next = null;
                if(temp.val<l1.val){
                    temp.next = l1;
                    l1 = temp;
                }
                else if(temp.val == l1.val){
                    ListNode tempL1Next = l1.next;
                    l1.next = temp;
                    temp.next = tempL1Next;
                }
                else {
                    if(l1.next!=null){
                        if(temp.val <= l1.next.val){
                            ListNode tempL1Next = l1.next;
                            l1.next = temp;
                            temp.next = tempL1Next;
                        }
                        else {

                            mergeTwoLists(l1.next, temp);
                        }
                    }
                    else {
                        ListNode tempL1Next = l1.next;
                        l1.next = temp;
                        temp.next = tempL1Next;
                    }

                }
            }
            return l1;
        }
    }
}