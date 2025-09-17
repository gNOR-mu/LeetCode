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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        return helper(root, targetSum, 0) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);

    }

    private int helper(TreeNode root, int targetSum, long sum) {
        if (root == null) {
            return 0;
        }
        sum += root.val;
        int s = sum == targetSum ? 1 : 0;

        return s + helper(root.left, targetSum, sum) + helper(root.right, targetSum, sum);
    }
}