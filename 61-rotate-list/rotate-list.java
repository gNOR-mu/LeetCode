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
        if (head == null) {
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
        d.get(d.size() - k - 1).next = null;
        d.getLast().next = head;
        return d.get(d.size() - k);
    }
}