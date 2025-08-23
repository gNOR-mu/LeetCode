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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList();
        sortValues(root, list);
        System.out.println(list.toString());
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int l = list.get(left);
            int r = list.get(right);
            int sum = l + r;
            if (sum == k) {
                return true;
            }else if(sum > k){
                right--;
            }else if(sum <k){
                left++;
            }
        }
        return false;
    }

    private void sortValues(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        sortValues(root.left, list);
        list.add(root.val);
        sortValues(root.right, list);
    }
}