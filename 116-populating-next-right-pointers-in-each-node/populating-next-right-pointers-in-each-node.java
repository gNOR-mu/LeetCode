/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            Node tmp = q.poll();
            if(tmp.left != null){
                q.offer(tmp.left);
            }
            if(tmp.right!=null){
                q.offer(tmp.right);
            }

            for(int i=1;i<size;i++){
                Node node = q.poll();
                tmp.next = node;
                tmp = tmp.next;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
        }
        return root;
    }
}