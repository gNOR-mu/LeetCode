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
class BSTIterator {
    Queue<Integer> queue = new LinkedList();

    public BSTIterator(TreeNode root) {
        // initQueue(root);
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            queue.offer(current.val);
            current = current.right;
        }
    }

    public int next() {
        return queue.poll();
    }
    // private void initQueue(TreeNode root){
    //     if(root==null){
    //         return;
    //     }
    //     initQueue(root.left);
    //     queue.offer(root.val);
    //     initQueue(root.right);
    // }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */