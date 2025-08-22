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
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        TreeNode tmp;
        traverse(root, list);
        for(int i=0;i<list.size()-1;i++){
            tmp = list.get(i);
            tmp.left =null;
            tmp.right = list.get(i+1);
        }
    }

    private void traverse(TreeNode root, List<TreeNode> list){
        if(root ==null){
            return;
        }
        list.add(root);
        traverse(root.left,list);
        traverse(root.right,list);
    }
}