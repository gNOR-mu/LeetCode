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
        return helper(root, new ArrayList<>());
    }

    private int helper(TreeNode root, List<Integer> ancestors) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int maxDiff = 0;
        for (Integer i : ancestors) {
            int diff = Math.abs(root.val - i);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        ancestors.add(root.val);
        int left = helper(root.left, ancestors);
        int right = helper(root.right, ancestors);
        ancestors.removeLast();
        maxDiff = Math.max(maxDiff, left);
        maxDiff = Math.max(maxDiff, right);
        return maxDiff;
    }
}