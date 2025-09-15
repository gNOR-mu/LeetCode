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

        AtomicInteger res = new AtomicInteger(0);
        helper(root, 1, new AtomicInteger(0), res);
        return res.get();
    }

    private void helper(TreeNode root, int level, AtomicInteger maxLevel, AtomicInteger res) {
        if (root == null) {
            return;
        }
        // en caso de que vuelva a visitar otro nodo con el mismo nivel
        // se va a considerar como falso, por lo tanto no evalua su valor
        if (level > maxLevel.get()) {
            res.set(root.val);
            maxLevel.set(level);
        }
        level++;

        helper(root.left, level, maxLevel, res);
        helper(root.right, level, maxLevel, res);
    }
}