/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // Node temp = head;
        // if(head == null) return new Node(x);
        // while(temp.next!=null){
        //     temp= temp.next;
        // }
        // temp.next = new Node(x);
        // return head;
        Node newnode=new Node(x);
        Node temp=head;
        if(head==null) return newnode;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
}
 