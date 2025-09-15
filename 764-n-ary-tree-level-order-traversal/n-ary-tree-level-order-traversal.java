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

        List<List<Integer>> list = new ArrayList<>();
        helper(root, 0, list);
        return list;
    }

    private void helper(Node root, int level, List<List<Integer>> list) {
        if (root == null) {
            return;
        }
        if (list.size() == level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);

        for(var c:root.children){
            helper(c,level+1,list);
        }
    }
}