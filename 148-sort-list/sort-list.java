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
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        list.sort((a, b) -> a.val - b.val);
        ListNode first = list.get(0);
        ListNode tmp = first;
        for (int i = 1; i < list.size(); i++) {
            ListNode next = list.get(i);
            tmp.next = next;
            tmp = next;
        }
        tmp.next = null;
        return first;

    }
}