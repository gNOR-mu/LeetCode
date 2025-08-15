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
    public boolean isPalindrome(ListNode head) {
        // StringBuilder sb = new StringBuilder();
        // ListNode tmp = head;
        // while(tmp!=null){
        //     sb.append(tmp.val);
        //     tmp = tmp.next;
        // }
        // return sb.toString().equals(sb.reverse().toString());
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode invert = slow;
        ListNode prev = null;
        while (invert != null) {
            ListNode tmp = invert.next;
            invert.next = prev;
            prev = invert;
            invert = tmp;
        }
        invert = prev;

        ListNode h2 = head;
        while (invert != null) {
            if (h2.val != invert.val) {
                return false;
            }
            h2 = h2.next;
            invert = invert.next;
        }
        return true;
    }
}