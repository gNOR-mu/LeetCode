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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        sum(root, targetSum, new ArrayList<>(), res);
        return res;
    }

    private void sum(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        targetSum -= root.val;
        path.add(root.val);
        if(root.left == null && root.right==null && targetSum==0){
            res.add(new ArrayList(path));
        }
        sum(root.left, targetSum, path, res);
        sum(root.right, targetSum, path, res);
        path.removeLast();

    }
}