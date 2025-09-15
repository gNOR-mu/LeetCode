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
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root, root.val, root.val);
    }

    private int helper(TreeNode root, int min, int max) {
        if (root == null) {
            return 0;
        }
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);

        int diff = max - min;
        diff = Math.max(diff, helper(root.left, min, max));
        diff = Math.max(diff, helper(root.right, min, max));
        return diff;
    }
}