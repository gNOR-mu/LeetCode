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
        public ListNode middleNode(ListNode head) {
        int total = 0;
        int actual = 1;
        ListNode resp = head;
        ListNode tmp = head.next;
        while (tmp != null) {
            int mid = (++total / 2) + 1;
            if (mid > actual) {
                resp = resp.next;
                actual = mid;
            }
            tmp = tmp.next;
        }
        return ((total & 1) == 0 ? resp : resp.next);
        }
}