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
        if(head==null){
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        while(head != null){
            ListNode tmp = head;
            pq.offer(head);
            head = head.next;
            tmp.next = null;
        }
        ListNode res = pq.poll();
        ListNode tmp = res;
        while(!pq.isEmpty()){
            tmp.next = pq.poll();
            tmp = tmp.next;
        }
        return res;

    }
}