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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer[]>> map = new TreeMap<>();
        helper(root, 0,0, map);
        for (var v : map.values()) {
            v.sort((a, b) -> {
                if (a[1] != b[1]) {
                    return a[1] - b[1];
                } else {
                    return a[0] - b[0];
                }
            });
            List<Integer> list = new ArrayList<>();
            for(var v2:v){
                list.add(v2[0]);
            }
            res.add(list);
        }
        return res;

    }

    private void helper(TreeNode root, int level, int col, Map<Integer, List<Integer[]>> map) {
        if (root == null) {
            return;
        }
        var v = map.getOrDefault(col, new ArrayList<>());
        v.add(new Integer[] { root.val, level });
        map.put(col, v);
        helper(root.left, level + 1, col - 1, map);
        helper(root.right, level + 1, col + 1, map);
    }
}