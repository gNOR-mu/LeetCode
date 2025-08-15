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
    public ListNode swapPairs(ListNode head) {
        ListNode h2 = new ListNode(0, head);
        ListNode tmp = h2;
        while (tmp.next != null && tmp.next.next != null) {
            ListNode tercero = tmp.next.next.next;
            ListNode primero = tmp.next;
            tmp.next = tmp.next.next;
            tmp.next.next = primero;
            primero.next = tercero;
            tmp = tmp.next.next;
        }
        return h2.next;
    }
}