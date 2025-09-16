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
        Map<Integer, List<Integer[]>> map = new TreeMap<>();
        helper(root, 0, 0, map);
        List<List<Integer>> res = map.values().stream()
                .map(v -> v.stream()
                        .sorted(Comparator.comparingInt(arr -> ((Integer[]) arr)[1])
                                .thenComparingInt(arr -> ((Integer[]) arr)[0]))
                        .map(arr -> ((Integer[]) arr)[0])
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        return res;

    }

    private void helper(TreeNode root, int level, int col, Map<Integer, List<Integer[]>> map) {
        if (root == null) {
            return;
        }
        map.computeIfAbsent(col, _ -> new ArrayList<>()).add(new Integer[] { root.val, level });
        helper(root.left, level + 1, col - 1, map);
        helper(root.right, level + 1, col + 1, map);
    }
}