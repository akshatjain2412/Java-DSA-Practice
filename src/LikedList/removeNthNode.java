package LikedList;

public class removeNthNode {
    static Node removeNthNode(Node head,int n)
    {
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
            slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        linkedList.Linkedlist ll=new linkedList.Linkedlist();
        ll.add(423);
        ll.add(3443);
        ll.add(424);
        ll.add(343);
        ll.head=removeNthNode(ll.head,4);
        ll.get();
    }
}
