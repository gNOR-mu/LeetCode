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
    public ListNode removeElements(ListNode head, int val) {
                if(head == null)return head;
        ListNode slow = new ListNode(0, head);
        ListNode fast = head;
        ListNode res = slow;
        while (fast != null) {
            if (fast.val == val) {
                fast = fast.next;
            } else {
                slow.next = fast;
                slow = slow.next;
                fast = fast.next;
            }
        }
        if (slow.next != null && slow.next.val == val) {
            slow.next = null;
        }
        return res.next;
    }
}