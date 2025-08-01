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
    public ListNode reverseList(ListNode head) {
        // ListNode sol=null;

        // while (head != null) {
        //     sol = new ListNode(head.val, sol);
        //     head = head.next;
        // }
        // return sol;
        if (head == null)
            return null;
        ListNode temp = head.next;
        head.next = null;
        while (temp != null) {
            ListNode t2 = temp.next;
            temp.next = head;
            head = temp;
            temp = t2;
        }
        return head;
    }
}
