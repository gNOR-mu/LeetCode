/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        dfsValues(root, pq);
        int min = Integer.MAX_VALUE;
        while (!pq.isEmpty()) {
            int diff = pq.poll();
            if(pq.peek()==null){
                break;
            }
            diff = Math.abs(diff-pq.peek());
            if(diff < min){
                min = diff;
            }
        }
        return min;
    }

    private void dfsValues(TreeNode root, PriorityQueue<Integer> pq) {
        if (root == null) {
            return;
        }
        pq.add(root.val);
        dfsValues(root.left, pq);
        dfsValues(root.right, pq);
    }
}