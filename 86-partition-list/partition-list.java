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
    public ListNode partition(ListNode head, int x) {
        ListNode menor = new ListNode();
        ListNode mayor = new ListNode();
        ListNode men = menor;
        ListNode may = mayor;

        while (head != null) {
            if (head.val < x) {
                men.next = new ListNode(head.val);
                men = men.next;
            } else {
                may.next = new ListNode(head.val);
                may = may.next;
            }
            head = head.next;
        }
        men.next = mayor.next;
        return menor.next;
    }
}