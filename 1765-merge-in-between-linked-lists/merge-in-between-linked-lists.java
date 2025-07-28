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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l1Aux = list1;
        ListNode l2Aux = list2;
        ListNode anterior = null;
        ListNode siguiente = null;

        for (int i = 0; i <= b; i++) {
            if (i == a - 1) {
                anterior = l1Aux;
            } else if (i == b) {
                siguiente = l1Aux.next;
            }
            l1Aux = l1Aux.next;
        }
        while (l2Aux.next != null) {
            l2Aux = l2Aux.next;
        }
        l2Aux.next = siguiente;
        anterior.next = list2;
        return list1;
    }
}