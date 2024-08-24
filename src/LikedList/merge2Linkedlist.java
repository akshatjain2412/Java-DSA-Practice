package LikedList;

public class merge2Linkedlist {
    public Node mergeTwoLists(Node list1, Node list2) {
        Node temp1=list1;
        Node temp2=list2;
        Node head=new Node(54);
        Node temp=head;
        while(temp1!=null&&temp2!=null){
            if(temp1.data<temp2.data){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;

            }
            else{

                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1!=null){
            temp.next=temp1;
        }
        if(temp2!=null){
            temp.next=temp2;
        }

        return head.next;

    }
}
