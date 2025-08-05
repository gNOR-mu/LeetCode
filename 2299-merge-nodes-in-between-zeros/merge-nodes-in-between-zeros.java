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
        head = head.next;
        while (head != null) {
            if (head.val != 0) {
                sol.val += head.val;
            } else if (head.next != null) {
                sol.next = new ListNode();
                sol = sol.next;
            }
            head = head.next;
        }
        return solHead;
    }
}