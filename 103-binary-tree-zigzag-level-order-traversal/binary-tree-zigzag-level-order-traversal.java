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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        // Queue<TreeNode> queue = new LinkedList<>();
        // List<List<Integer>> list = new ArrayList<>();

        // queue.offer(root);
        // boolean reversed = false;
        // while (!queue.isEmpty()) {
        //     int size = queue.size();
        //     List<Integer> levelList = new ArrayList<>();

        //     for (int i = 0; i < size; i++) {
        //         TreeNode node = queue.poll();
        //         //nivel par, lo agrego en orden normal
        //         if (!reversed) {
        //             levelList.add(node.val);
        //         } else {
        //             levelList.add(0, node.val);
        //         }
        //         if (node.left != null) {
        //             queue.offer(node.left);
        //         }
        //         if (node.right != null) {
        //             queue.offer(node.right);
        //         }
        //     }
        //     reversed = !reversed;
        //     list.add(levelList);
        // }
        // return list;
        List<List<Integer>> list = new ArrayList<>();
        helper(root, 0, list, false);
        return list;
    }

    private void helper(TreeNode root, int level, List<List<Integer>> list, boolean reverse) {
        if (root == null) {
            return;
        }
        if (list.size() == level) {
            list.add(new ArrayList<>());
        }
        var listLevel = list.get(level);
        int pos = reverse ? 0 : listLevel.size();
        listLevel.add(pos, root.val);
        helper(root.left, level + 1, list, !reverse);
        helper(root.right, level + 1, list, !reverse);
    }
}