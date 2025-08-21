/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        q.offer(root);
        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            res.add(new ArrayList<>());
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                res.get(level).add(node.val);
                for(var n:node.children){
                    if(n!=null){
                        q.offer(n);
                    }
                }
            }
            level++;
        }
        return res;
    }
}