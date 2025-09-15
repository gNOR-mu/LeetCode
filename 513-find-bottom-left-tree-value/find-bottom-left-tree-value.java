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
    Integer res;
    Integer maxLevel;

    public int findBottomLeftValue(TreeNode root) {
        res = null;
        maxLevel = 0;
        helper(root, 0);
        return res;
    }

    private void helper(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        maxLevel = Math.max(level, maxLevel);
        if (level == maxLevel && (root.left != null || root.right != null)) {
            res = null;
        }
        helper(root.left, level + 1);
        helper(root.right, level + 1);
        if (level == maxLevel && res == null) {
            res = root.val;
        }
    }
}