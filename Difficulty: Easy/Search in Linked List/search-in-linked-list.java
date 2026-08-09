/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        if(head==null) return false;
        if(head.data==key){
            return true;
        }
        return searchKey(head.next,key);
    }
}