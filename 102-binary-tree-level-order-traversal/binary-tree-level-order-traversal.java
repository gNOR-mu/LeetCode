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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        // Queue<TreeNode> q = new LinkedList<>();
        // List<List<Integer>> res = new ArrayList<>();

        // q.offer(root);
        // while (!q.isEmpty()) {
        //     int size = q.size();
        //     List<Integer> level = new ArrayList<>();
        //     for (int i = 0; i < size; i++) {
        //         TreeNode node = q.poll();
        //         level.add(node.val);
        //         if (node.left != null) {
        //             q.offer(node.left);
        //         }
        //         if(node.right !=null){
        //             q.offer(node.right);
        //         }
        //     }
        //     res.add(level);
        // }
        // return res;
        List<List<Integer>> list = new ArrayList<>();
        helper(root, 1, list);
        return list;
    }

    private void helper(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        if (list.size() < level) {
            list.add(new ArrayList<>());
        }
        list.get(level - 1).add(root.val);
        helper(root.left, level + 1, list);
        helper(root.right, level + 1, list);
    }

}