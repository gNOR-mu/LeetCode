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
    public int findBottomLeftValue(TreeNode root) {
        Integer[] data = {
                0, // val
                0, // max level
        };
        helper(root, 1, data);
        return data[0];
    }

    private void helper(TreeNode root, int level, Integer[] data) {
        if (root == null) {
            return;
        }
        boolean isFirstMaxLevel = false;
        // en caso de que vuelva a visitar otro nodo con el mismo nivel
        // se va a considerar como falso, por lo tanto no evalua su valor
        if (level > data[1]) {
            data[0] = null;
            data[1] = level;
            isFirstMaxLevel = true;
        }
        if (isFirstMaxLevel && (root.left != null || root.right != null)) {
            data[0] = null;
        }
        helper(root.left, level + 1, data);
        helper(root.right, level + 1, data);
        if (level == data[1] && isFirstMaxLevel ) {
            data[0] = root.val;
        }
    }
}