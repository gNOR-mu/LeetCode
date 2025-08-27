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
    public TreeNode reverseOddLevels(TreeNode root) {
        reverse(root.left, root.right, true);
        return root;

    }

    private void reverse(TreeNode left, TreeNode right, boolean reverse) {
        if (left == null || right == null) {
            return;
        }
        if (reverse) {
            int tmp = left.val;
            left.val = right.val;
            right.val = tmp;
        }
        reverse(left.left, right.right, !reverse);
        reverse(left.right, right.left, !reverse);
    }
}