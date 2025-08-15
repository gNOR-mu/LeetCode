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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode tmp = head;
        while (tmp != null && tmp.next.next != null) {
            tmp = tmp.next;
        }
        if (tmp == null) {
            return;
        }
        tmp.next.next = head.next;
        head.next = tmp.next;
        tmp.next = null;
        reorderList(head.next.next);
    }
}