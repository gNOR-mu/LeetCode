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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        // List<Integer> l1 = new ArrayList<>();
        // List<Integer> l2 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        addToList(root1, res);
        addToList(root2, res);
        res.sort(null);


        // int l = 0;
        // int r = 0;
        // while (l < l1.size() && r < l2.size()) {
        //     int v1 = l1.get(l);
        //     int v2 = l2.get(r);
        //     if (v1 <= v2) {
        //         l++;
        //         res.add(v1);
        //     } else {
        //         r++;
        //         res.add(v2);
        //     }
        // }
        // while (l < l1.size()) {
        //     res.add(l1.get(l));
        //     l++;
        // }
        // while (r < l2.size()) {
        //     res.add(l2.get(r));
        //     r++;
        // }
        return res;
    }

    private void addToList(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        addToList(root.left, res);
        res.add(root.val);
        addToList(root.right, res);
    }
}