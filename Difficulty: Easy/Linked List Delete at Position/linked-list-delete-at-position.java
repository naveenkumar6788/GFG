/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head==null) return null;
        if(x==1) return head.next;
        Node curr=head;
        for(int i=1;i<x-1;i++){
            if(curr.next==null){
                return head;
            }
            curr=curr.next;
        }
        if(curr.next==null){
            return head;
        }
        curr.next=curr.next.next;
        return head;
    }
}