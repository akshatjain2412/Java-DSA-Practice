package LikedList;

public class WhereCycleStart {
    public Node detectCycle(Node head) {
        Node fast=head;
        Node slow=head;
        if(head==null||head.next==null){
            return null;
        }
        if(fast.next==null||fast.next.next==null){
            return null;
        }
        while(fast!=null){
            if(fast.next==null){
                return null;
            }
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        Node temp=head;
        while(temp!=slow){
            if(slow==null){
                return null;
            }
            temp=temp.next;
            slow=slow.next;
        }
        return temp;
    }

}
