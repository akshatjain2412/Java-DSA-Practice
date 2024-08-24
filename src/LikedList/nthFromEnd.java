package LikedList;

import LikedList.linkedList.Linkedlist;
public class nthFromEnd {
    static Node nthidx(Node head,int n){    //this is normal approach in which we traverse linked list and find size
        //then we subtract n from size and then again traverse then we find our required Node.
        int size=1;
        if(head==null){
            size=0;
        }
        Node temp=head;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
            if (size >= n) {
                int nth = size - n + 1;
                temp = head;
                while (nth-- > 1) {
                    temp = temp.next;
                }
                return temp;
            }
            else {
                temp=null;
                return temp;
            }
    }
    static Node nthnode(Node head,int n){  //in this we use fast and slow pointer approach
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.add(5);
        ll.add(55);
        ll.add(34);
        Node a=nthidx(ll.head,2);
        Node b=nthnode(ll.head,3);
        System.out.println(a.data+" "+b.data);
    }
}
