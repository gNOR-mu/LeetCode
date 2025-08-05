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
    public ListNode mergeNodes(ListNode head) {
        ListNode sol = new ListNode();
        ListNode solHead = sol;
        int sum = 0;
        head = head.next;
        while (head != null) {
            sum += head.val;
            if (head.val == 0) {
                sol.next = new ListNode(sum);
                sol = sol.next;
                sum = 0;
            }
            head = head.next;
        }
        return solHead.next;
    }
}