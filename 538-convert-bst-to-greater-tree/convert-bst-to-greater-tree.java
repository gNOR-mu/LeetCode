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
    public TreeNode convertBST(TreeNode root) {
        convert(root, 0);
        return root;
    }

    private int convert(TreeNode root, int s) {
        if (root == null) {
            return s;
        }
        int sum = convert(root.right, s);
        root.val += sum;
        return convert(root.left, root.val);
    }
}