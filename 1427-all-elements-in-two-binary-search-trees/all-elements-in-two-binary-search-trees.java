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
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        addToList(root1, pq);
        addToList(root2, pq);
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }

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

    private void addToList(TreeNode root, PriorityQueue<Integer> pq) {
        if (root == null) {
            return;
        }
        addToList(root.left, pq);
        pq.offer(root.val);
        addToList(root.right, pq);
    }
}