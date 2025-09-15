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
    public int maxLevelSum(TreeNode root) {
        Map<Integer, Integer> sums = new HashMap<>();
        helper(root, 0, sums);
        int[] level = {
                1, // nivel
                sums.get(0) // suma
        };
        for (int i = 1; i < sums.size(); i++) {
            int sum = sums.get(i);
            if (sum > level[1]) {
                level[0] = i+1;
                level[1] = sum;
            }
        }
        return level[0];

    }

    private void helper(TreeNode root, int level, Map<Integer, Integer> sums) {
        if (root == null) {
            return;
        }
        int sumLevel = sums.getOrDefault(level, 0) + root.val;
        sums.put(level, sumLevel);
        helper(root.left, level + 1, sums);
        helper(root.right, level + 1, sums);

    }
}