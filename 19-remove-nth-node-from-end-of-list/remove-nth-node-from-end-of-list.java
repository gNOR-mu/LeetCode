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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        Map<Integer, ListNode> mapa = new HashMap<>();
        ListNode headAux = head;
        int contador = 0;
        while (headAux != null) {
            mapa.put(contador++, headAux);
            headAux = headAux.next;
        }
        int size = mapa.size() - n;
        if (size == 0) {
            return head.next;
        }
        mapa.get(size - 1).next = mapa.get(size + 1);
        return head;
    }
}