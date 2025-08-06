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
    public ListNode deleteMiddle(ListNode head) {
        if (head ==null || head.next == null) {
            return null;
        }
        int total = 0;
        int actual = 1;
        ListNode resp = head;
        ListNode tmp = head.next;
        while (tmp != null) {
            int mid = (++total / 2);
            if (mid > actual) {
                resp = resp.next;
                actual = mid;
            }
            tmp = tmp.next;
        }
        if ((total & 1) == 1 && total - actual > 0) {
            resp = resp.next;
        }
        resp.next = resp.next.next;
        return head;
    }
}