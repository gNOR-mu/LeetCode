/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1.next;
        l1.next = null;
        while (temp != null) {
            ListNode t2 = temp.next;
            temp.next = l1;
            l1 = temp;
            temp = t2;
        }

        temp = l2.next;
        l2.next = null;
        while (temp != null) {
            ListNode t2 = temp.next;
            temp.next = l2;
            l2 = temp;
            temp = t2;
        }
        ListNode res = null;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;
            carry = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum >= 10) {
                carry = sum / 10;
                sum -= 10;
            }
            res = new ListNode(sum, res);
        }
        return res;
    }
}