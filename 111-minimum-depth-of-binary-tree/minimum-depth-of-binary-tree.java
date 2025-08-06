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
    public int minDepth(TreeNode root) {
        return minD(root, 1);
    }

    public int minD(TreeNode root, int depth) {
        if (root == null) return depth - 1;
        if (root.left == null && root.right == null) return depth;
        if(root.left == null && root.right!=null){
            return minD(root.right, depth + 1);
        }
        if(root.left!=null && root.right == null){
            return minD(root.left, depth + 1);
        }
        return Math.min(minD(root.left, depth + 1), minD(root.right, depth + 1));
    }
}