/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int value = 0;
        ListNode result = new ListNode(0);
        ListNode index = result;

        while (l1!=null && l2!=null){
            if(l1.val+l2.val+carry>9){
                value = l1.val+l2.val+carry-10;
                carry = 1;
            }
            else {
                value = l1.val+l2.val+carry;
                carry = 0;
            }
            ListNode node = new ListNode(value);
            index.next = node;
            index = index.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 == null && l2 == null){
            if(carry == 1){
                ListNode node = new ListNode(1);
                index.next = node;
            }
            return result.next;
        }
        else if(l1==null){
            index.next = l2;
        }
        else if(l2 == null){
            index.next = l1;
        }
        ListNode preIndex = index;
        index = index.next;
        while (index!=null){
            if(index.val+carry > 9){
                index.val = index.val+carry-10;
                carry = 1;
            }
            else {
                index.val = index.val+carry;
                carry = 0;
            }
            preIndex = index;
            index = index.next;
        }

        if(carry == 1){
            preIndex.next = new ListNode(1);
        }
        return result.next;
    }
}