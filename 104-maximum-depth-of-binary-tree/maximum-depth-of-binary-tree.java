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
    public int maxDepth(TreeNode root) {
        return md(root,1);
    }

    public int md(TreeNode root, int depth) {
        if (root == null) {
            return depth - 1;
        }
        if (root.left == null && root.right == null) {
            return depth;
        }
        return Math.max(md(root.left, depth + 1), md(root.right, depth + 1));
    }
}