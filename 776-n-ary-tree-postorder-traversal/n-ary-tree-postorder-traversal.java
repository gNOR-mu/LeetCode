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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        travel(root, list);
        return list;
    }

    private void travel(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        for (var n : root.children) {
            travel(n, list);
        }
        list.add(root.val);
    }
}