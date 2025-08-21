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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node != null) {
                    list.add(node.val);
                } else {
                    list.add(-101);
                    continue;
                }
                q.offer(node.left);
                q.offer(node.right);
            }
            for (int i = 0; i < list.size() / 2; i++) {
                if (list.get(i) != list.get(list.size() - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }
}