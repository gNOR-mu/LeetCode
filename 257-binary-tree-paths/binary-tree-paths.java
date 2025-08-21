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
        String path = "" + root.val;
        if (root.left == null && root.right == null) {
            list.add(path);
            return list;
        }
        paths(root.left, list, path);
        paths(root.right, list, path);
        return list;
    }

    public void paths(TreeNode root, List<String> list, String path) {
        if (root == null) {
            return;
        }
        path += "->" + root.val;
        if (root.left == null && root.right == null) {
            list.add(path);
        }
        paths(root.left, list, path);
        paths(root.right, list, path);
    }

}