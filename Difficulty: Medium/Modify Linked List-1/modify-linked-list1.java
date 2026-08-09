/* Node Structure
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
    public Node modifyTheList(Node head) {
        // code here
        ArrayList<Node> list = new ArrayList<>();
        Node curr=head;
        while(curr!=null){
            list.add(curr);
            curr=curr.next;
        }
        int left=0;
        int right=list.size()-1;
        while(left<right){
            int first=list.get(left).data;
            int second=list.get(right).data;
            list.get(left).data=second-first;
            list.get(right).data=first;
            left++;
            right--;
        }
        return head;
    }
}