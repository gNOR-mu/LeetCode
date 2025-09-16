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
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        helper(root, map);
        List<Integer> max = new ArrayList<>();
        int maxFreq = 1;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int freq = e.getValue();
            if (freq > maxFreq) {
                max.clear();
                maxFreq = freq;
            }
            if (freq == maxFreq) {
                max.add(e.getKey());
            }
        }
        int[] res = new int[max.size()];
        for (int i = 0; i < max.size(); i++) {
            res[i] = max.get(i);
        }
        return res;

    }

    private void helper(TreeNode root, Map<Integer,Integer> map) {
        if (root == null) {
            return;
        }
        map.merge(sumSubTree(root), 1, (a, _) -> a + 1);

        helper(root.left, map);
        helper(root.right, map);
    }

    private int sumSubTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + sumSubTree(root.left) + sumSubTree(root.right);

    }
}