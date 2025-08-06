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
    private int deep = 0;
    private int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        calculateSum(root, 0);
        return sum;
    }

    public void calculateSum(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        level++;
        if (root.left == null && root.right == null && level >= deep) {
            if(level > deep){
                deep = level;
                sum = 0;
            }
            sum += root.val;
        }
        calculateSum(root.left, level);
        calculateSum(root.right, level);
    }
}