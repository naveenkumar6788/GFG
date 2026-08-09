/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node deleteHead(Node head) {
        // code here
        if(head==null) return null;
            Node temp=head;
            head=head.next;
            temp=null;
            return head;
    }
}