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
        Queue<TreeNode> q = new LinkedList<>();
        boolean isEvenLevel = true;
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (isEvenLevel) {
                    if ((node.val & 1) == 0 || node.val <= min) {
                        return false;
                    }
                    min = node.val;
                } else if (!isEvenLevel) {
                    if ((node.val & 1) == 1 || node.val >= max) {
                        return false;
                    }
                    max = node.val;
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            isEvenLevel = !isEvenLevel;
        }
        return true;
    }
}