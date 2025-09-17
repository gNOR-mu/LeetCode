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
    public boolean isEvenOddTree(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        return helper(root, 0, map);
    }

    private boolean helper(TreeNode root, int level, Map<Integer, Integer> map) {
        if (root == null) {
            return true;
        }
        boolean isEven = (root.val & 1) == 0;
        boolean isEvenLevel = (level & 1) == 0;
        if (isEvenLevel) {
            if (isEven || (root.val <= map.getOrDefault(level, Integer.MIN_VALUE))) {
                return false;
            }
        } else if (!isEvenLevel) {
            if (!isEven || root.val >= map.getOrDefault(level, Integer.MAX_VALUE)) {
                return false;
            }
        }
        map.put(level, root.val);
        return helper(root.left, level + 1, map) && helper(root.right, level + 1, map);
    }
}