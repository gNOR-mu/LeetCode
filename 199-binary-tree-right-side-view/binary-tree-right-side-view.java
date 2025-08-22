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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return res;
        }
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            int val = 0;
            for(int i=0;i<size;i++){
                TreeNode tn = q.poll();
                val = tn.val;
                if(tn.left != null){
                    q.offer(tn.left);
                }
                if(tn.right != null){
                    q.offer(tn.right);
                }
            }
            res.add(val);
        }
        return res;


    }
}