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
        List<String> list = new ArrayList<>();
        helper(root, "", list);
        list.sort((a, b) -> a.compareTo(b));
        return list.getFirst();
    }

    private void helper(TreeNode root, String path, List<String> list) {
        if (root == null) {
            return;
        }
        path = (char) (root.val + 97) + path;
        if (root.left == null && root.right == null) {
            list.add(path);
        }
        helper(root.left, path, list);
        helper(root.right, path, list);
    }
}