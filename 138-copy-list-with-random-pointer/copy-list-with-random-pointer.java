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
        Node h2 = head;
        List<Node> lHead = new ArrayList<>();
        List<Node> lNew = new ArrayList<>();
        Node newHead = new Node(0);
        Node tmp = newHead;
        while(h2!=null){
            tmp.next = new Node(h2.val);
            tmp = tmp.next;

            lHead.add(h2);
            lNew.add(tmp);
            h2 = h2.next;
        }
        for(int i=0;i<lHead.size();i++){
            Node node = lHead.get(i);
            if(node.random != null){
                int index = lHead.indexOf(node.random);
                lNew.get(i).random = lNew.get(index);
            }
        }
        return newHead.next;
    }
}