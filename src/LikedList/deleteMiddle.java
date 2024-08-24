package LikedList;

public class deleteMiddle {
    static Node deleteMiddl(Node head) {
        if(head.next==null){
            return null;
        }
        Node fast=head.next.next;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }

      public static void main(String[] args) {
        linkedList.Linkedlist ll=new linkedList.Linkedlist();
        ll.add(12);
        ll.add(56);
        ll.add(32);
        ll.add(1);
        ll.add(5);
        ll.add(3);
        Node al=deleteMiddl(ll.head);
        System.out.println(al.data);
    }
}
