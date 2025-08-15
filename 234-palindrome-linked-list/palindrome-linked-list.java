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

        ListNode slow2 = slow;
        ListNode invert = null;
        while (slow2 != null) {
            invert = new ListNode(slow2.val, invert);
            slow2 = slow2.next;
        }

        ListNode h2 = head;
        while (h2 != slow && invert != null) {
            if (h2.val != invert.val) {
                return false;
            }
            h2 = h2.next;
            invert = invert.next;
        }
        return true;
    }
}