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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if (nums.length == 0 || head == null) {
            return head;
        }
        Set<Integer> n = new HashSet<>();
        ListNode tmp = head;
        for (int i = 0; i < nums.length; i++) {
            n.add(nums[i]);
        }
        while (n.contains(head.val)) {
            head = head.next;
        }
        while (tmp != null && tmp.next != null) {
            if (n.contains(tmp.next.val)) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return head;
    }
}