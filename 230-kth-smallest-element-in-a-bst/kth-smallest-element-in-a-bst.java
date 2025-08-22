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
    private int total = 0;
    private int val = 0;

    public int kthSmallest(TreeNode root, int k) {
        find(root, k);
        return val;
    }

    private void find(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        find(root.left, k);
        total++;
        if (total == k) {
            val = root.val;
            return;
        }
        find(root.right, k);

    }
}