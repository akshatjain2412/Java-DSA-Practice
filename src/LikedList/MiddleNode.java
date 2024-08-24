package LikedList;

public class MiddleNode {
    public static  Node middleNode(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        linkedList.Linkedlist ll=new linkedList.Linkedlist();
        ll.add(12);
        ll.add(56);
        ll.add(32);
        ll.add(1);
        ll.add(5);
        ll.add(3);
        System.out.println(middleNode(ll.head).data);
    }
}
