package LikedList;

public class cycleInList {
    public static boolean hasCycle(Node head) {
        if(head==null||head.next==null)
        {
            return false;
        }
        Node slow=head;
        Node fast=head;
        if(fast.next==null||fast.next.next==null){
            return false;
        }

        while(fast!=null) {

            if(fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;

            if (fast==slow&&slow!=null)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Node a=new Node (43);
        Node b=new Node (32);
        Node c=new Node (42);
        Node d=new Node (424);
        Node e=new Node (4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

//        e.next=c;

        System.out.println(hasCycle(a));

    }
}
