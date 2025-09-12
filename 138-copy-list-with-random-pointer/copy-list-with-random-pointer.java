/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> nodes = new HashMap<>();
        Node aux = new Node(0);
        Node tmp = aux;
        while(head!=null){
            tmp.next = new Node(head.val);
            tmp = tmp.next;
            tmp.val = head.val;

            nodes.put(head,tmp);
            head = head.next;
        }
        for(Map.Entry<Node,Node> n: nodes.entrySet()){
            Node random = n.getKey().random;
            n.getValue().random = nodes.get(random);
        }
        return aux.next;

    }
}