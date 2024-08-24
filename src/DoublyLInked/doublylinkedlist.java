package DoublyLInked;

public class doublylinkedlist {
    DoublyNode head=null;
    DoublyNode tail=null;

    public void addend(int data){
        DoublyNode a=new DoublyNode(data);
        if(head==null){
            head=a;
            tail=a;
        }
        else{
            tail.next=a;
            a.prev=tail;
            tail=a;
        }

    }
    void  addAtposition(int data,int idx)

    {
        if(idx==0){
            addstart(data);
            return;
        }
        DoublyNode s=head;
        DoublyNode a=new DoublyNode(data);
        while(idx-->1)
        {
            s=s.next;
        }
        if(s.next==null){
            addend(data);
            return;
        }
        DoublyNode r=s.next;
        r.prev=a;
        s.next=a;
        a.next=r;
        a.prev=s;
    }
    void deleteAtpos(int idx){
        if(idx==0){
            deleteAtbeg();
            return;
        }
        DoublyNode s=head;
        while(idx-->1){
            s=s.next;
        }
        if(s.next.next==null){
            deleteAtend();
            return;
        }
        DoublyNode r=s.next;
        s.next=r.next;
        r.next.prev=s;

    }
    void deleteAtbeg()
    {
        if(head==null) return;
        if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    void deleteAtend()
    {
        if(head==null) return;
        if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
    }


    void addstart(int data){
        DoublyNode a=new DoublyNode((data));
        if(head==null){
            head=a;
            tail=a;
        }
        else{
            a.next=head;
            head.prev=a;
            head=a;
        }
    }
    void display(DoublyNode head){
        DoublyNode temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void displayRev(DoublyNode tail){
        DoublyNode temp=tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }

    public static void main(String[] args) {
        doublylinkedlist dll=new doublylinkedlist();
        dll.addend(45);
        dll.addend(46);
        dll.addend(87);
        dll.addend(21);
        dll.addstart(34);
        dll.deleteAtpos(0);
//        dll.deleteAtbeg();
//        dll.deleteAtend();
////        dll.deleteAtend();
        dll.display(dll.head);
        dll.displayRev(dll.tail);
    }
}
