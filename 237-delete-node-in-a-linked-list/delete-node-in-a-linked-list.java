/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode initial = node;

        while(initial != null){
            initial.val = initial.next.val;
            if(initial.next.next ==null){
                initial.next = null;
            }
            initial = initial.next;
        }
    }
}