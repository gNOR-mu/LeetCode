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
        // Map<Integer, Integer> sums = new HashMap<>();
        // helper(root, 0, sums);
        // int[] level = {
        //         1, // nivel
        //         sums.get(0) // suma
        // };
        // for (int i = 1; i < sums.size(); i++) {
        //     int sum = sums.get(i);
        //     if (sum > level[1]) {
        //         level[0] = i+1;
        //         level[1] = sum;
        //     }
        // }
        // return level[0];
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        int maxLevelSum = level;
        int maxSum = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            int size = q.size();
            int levelSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                levelSum += node.val;
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            if (levelSum > maxSum) {
                maxSum = levelSum;
                maxLevelSum = level;
            }
            level++;
        }
        return maxLevelSum;

    }

    // private void helper(TreeNode root, int level, Map<Integer, Integer> sums) {
    //     if (root == null) {
    //         return;
    //     }
    //     int sumLevel = sums.getOrDefault(level, 0) + root.val;
    //     sums.put(level, sumLevel);
    //     helper(root.left, level + 1, sums);
    //     helper(root.right, level + 1, sums);

    // }
}