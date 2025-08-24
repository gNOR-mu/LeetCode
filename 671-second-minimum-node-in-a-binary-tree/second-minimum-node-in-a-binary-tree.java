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

    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        getVal(root,pq);
        int val = pq.poll();
        while(!pq.isEmpty()){
            int v2 = pq.poll();
            if(v2 != val){
                return v2;
            }
        }
        return -1;
    }
    private void getVal(TreeNode root, PriorityQueue<Integer> pq){
        if(root==null){
            return;
        }
        pq.offer(root.val);

        getVal(root.left,pq);
        getVal(root.right,pq);
    }
}