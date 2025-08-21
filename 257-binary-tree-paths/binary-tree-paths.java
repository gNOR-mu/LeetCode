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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        paths(root, list, new StringBuilder());
        return list;
    }

    public void paths(TreeNode root, List<String> list, StringBuilder path) {
        if (root == null) {
            return;
        }
        path.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(path.toString());
        }
        path.append("->");
        paths(root.left, list, new StringBuilder(path));
        paths(root.right, list, new StringBuilder(path));
    }

}