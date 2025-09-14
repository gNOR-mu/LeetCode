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
    public String smallestFromLeaf(TreeNode root) {
        if (root == null) {
            return null;
        }
        return helper(root, "");
    }

    private String helper(TreeNode root, String path) {
        if (root == null) {
            return ""+(char)(123);//z+1
        }
        path = (char) (root.val + 97) + path;
        if (root.left == null && root.right == null) {
            return path;
        }
        String left = helper(root.left, path);
        String right = helper(root.right, path);
        return left.compareTo(right) < 0 ? left : right;
    }
}