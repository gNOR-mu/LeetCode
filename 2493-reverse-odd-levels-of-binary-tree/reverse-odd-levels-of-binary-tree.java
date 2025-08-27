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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean reverse = false;

        q.offer(root);

        while (!q.isEmpty()) {
            Deque<TreeNode> tn = new ArrayDeque<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode first = q.poll();
                tn.offer(first);
                if (first.left != null) {
                    q.offer(first.left);
                }
                if (first.right != null) {
                    q.offer(first.right);
                }
            }
            if (reverse) {
                int tnSize = tn.size() / 2;
                for (int i = 0; i < tnSize; i++) {
                    TreeNode first = tn.pollFirst();
                    TreeNode last = tn.pollLast();
                    int tmp = first.val;
                    first.val = last.val;
                    last.val = tmp;
                }
            }
            reverse = !reverse;
        }
        return root;
    }
}