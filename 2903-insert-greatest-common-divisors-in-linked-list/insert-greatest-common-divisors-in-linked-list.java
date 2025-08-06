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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode left = head;
        ListNode right = head.next;
        while (right != null) {
            int min = Math.min(left.val, right.val);
            while (left.val % min != 0 || right.val % min != 0) {
                min--;
            }
            left.next = new ListNode(min);
            left.next.next = right;
            left = right;
            right = right.next;
        }
        return head;
    }
}