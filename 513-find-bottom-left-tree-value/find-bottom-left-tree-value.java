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
        // en caso de que vuelva a visitar otro nodo con el mismo nivel
        // se va a considerar como falso, por lo tanto no evalua su valor
        if (level > data[1] ) {
            data[0] = root.val;
            data[1] = level;
        }

        helper(root.left, level + 1, data);
        helper(root.right, level + 1, data);
    }
}