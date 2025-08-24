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
    private int val;
    private int tmp;
    public int kthSmallest(TreeNode root, int k) {
        val = 0;
        tmp = 0;
        get(root,k);
        return val;
    }

    private void get(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        get(root.left, k);
        tmp++;
        if (tmp==k) {
            val = root.val;
            return;
        }
         get(root.right, k);
    }
}