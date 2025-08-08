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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        List<ListNode> d = new ArrayList<>();
        ListNode tmp = head;
        while (tmp != null) {
            d.add(tmp);
            tmp = tmp.next;
        }
        k %= d.size();
        if (k == 0) {
            return head;
        }
        ListNode anterior = d.get(d.size() - k - 1);
        ListNode res = anterior.next;
        d.getLast().next = head;
        anterior.next = null;
        return res;
    }
}