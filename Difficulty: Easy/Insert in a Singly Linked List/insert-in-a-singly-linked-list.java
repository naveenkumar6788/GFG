/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        
        Node newnode=new Node(val);
        if(pos<1) return head;
        if(pos==1){
            newnode.next=head;
            return newnode;
        }
        Node curr=head;
        for(int i=1;i<pos-1 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null) return head;
        newnode.next=curr.next;
        curr.next=newnode;
        return head;
    }
}