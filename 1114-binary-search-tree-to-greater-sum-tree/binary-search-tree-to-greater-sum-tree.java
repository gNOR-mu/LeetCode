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
    public TreeNode bstToGst(TreeNode root) {
        convert(root, 0);
        return root;

    }

    private int convert(TreeNode root, int val) {
        if (root == null) {
            return val;
        }
        root.val += convert(root.right, val);
        return convert(root.left, root.val);
    }
}