package LikedList;

public class reverse {
    public Node reverseList(Node head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        Node rev= reverseList(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return rev;

    }
    public Node itrreverseList(Node head){
        Node curr=head;
        Node prev=null;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }

}
