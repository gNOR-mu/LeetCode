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
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            int previous = level.get(0);
            boolean isEven = (previous & 1) == 0;
            if (isEvenLevel && isEven) {
                return false;
            } else if (!isEvenLevel && !isEven) {
                return false;
            }
            for (int i = 1; i < level.size(); i++) {
                int val = level.get(i);
                boolean isOdd = (val & 1) == 1;
                if(isEvenLevel && (!isOdd || val<=previous)){
                    return false;
                }else if(!isEvenLevel && (isOdd || val>=previous)){
                    return false;
                }
                previous = val;
            }
            isEvenLevel = !isEvenLevel;
        }
        return true;
    }
}