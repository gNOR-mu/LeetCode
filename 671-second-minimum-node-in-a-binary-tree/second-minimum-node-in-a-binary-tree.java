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

    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer> ts = new TreeSet<>();
        getVal(root, ts);
        if (ts.size() < 2) {
            return -1;
        }
        ts.pollFirst();
        return ts.first();

    }

    private void getVal(TreeNode root, TreeSet<Integer> ts) {
        if (root == null) {
            return;
        }
        ts.add(root.val);

        getVal(root.left, ts);
        getVal(root.right, ts);
    }
}