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
    public int maxDepth(Node root) {
        return max(root, 0);
    }

    public int max(Node root, int level) {
        if (root == null) {
            return level;
        }
        int maxDepth = ++level;
        for (var n : root.children) {
            int nl = max(n, level);
            if (nl > maxDepth) {
                maxDepth = nl;
            }
        }
        return maxDepth;
    }
}