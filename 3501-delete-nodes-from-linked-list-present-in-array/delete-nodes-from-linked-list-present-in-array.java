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
        Set<Integer> n = new HashSet<>();
        ListNode ln = new ListNode();
        ListNode tmp = ln;
        for (int i = 0; i < nums.length; i++) {
            n.add(nums[i]);
        }
        while (head != null) {
            if (!n.contains(head.val)) {
                tmp.next = new ListNode(head.val);
                tmp = tmp.next;
            }
            head = head.next;
        }
        return ln.next;
    }
}