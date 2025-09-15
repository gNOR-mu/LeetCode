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
        if (root.val < min) {
            min = root.val;
        }
        if (root.val > max) {
            max = root.val;
        }
        int diff = max - min;
        int left = helper(root.left, min, max);
        int right = helper(root.right, min, max);
        diff = Math.max(diff, left);
        diff = Math.max(diff, right);
        return diff;
    }
}