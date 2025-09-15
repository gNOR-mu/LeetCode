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
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int bl = root.val;
        while (!q.isEmpty()) {
            int size = q.size();
            bl = q.peek().val;
            for (int i = 0; i < size; i++) {
                TreeNode tn = q.poll();
                if (tn.left != null) {
                    q.offer(tn.left);
                }
                if (tn.right != null) {
                    q.offer(tn.right);
                }
            }
        }
        return bl;
    }
}