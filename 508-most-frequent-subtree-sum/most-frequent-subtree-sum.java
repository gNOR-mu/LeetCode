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
        List<Integer> sums = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        helper(root, sums);
        boolean duplicates = false;
        for (Integer i : sums) {
            map.merge(i, 1, (a, _) -> a + 1);

        }
        sums.clear();
        int maxFreq = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int freq = e.getValue();
            if (freq > maxFreq) {
                sums.clear();
                maxFreq = freq;
            }
            if (freq == maxFreq) {
                sums.add(e.getKey());
            }
        }
        int[] res = new int[sums.size()];
        for (int i = 0; i < sums.size(); i++) {
            res[i] = sums.get(i);
        }
        return res;

    }

    private void helper(TreeNode root, List<Integer> sums) {
        if (root == null) {
            return;
        }
        sums.add(sumSubTree(root));
        helper(root.left, sums);
        helper(root.right, sums);
    }

    private int sumSubTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + sumSubTree(root.left) + sumSubTree(root.right);

    }
}