package LikedList;

public class intersection {
    static Node findInter(Node head1,Node head2){
        int size1=0;
        Node temp1=head1;
        while(temp1!=null){
            size1++;
            temp1=temp1.next;
        }
        int size2=0;
        Node temp2=head2;
        while(temp2!=null){
            size2++;
            temp2=temp2.next;
        }
        Node tempA=head1;
        Node tempB=head2;
        if(size1>=size2){
            int diff=size1-size2;
            for(int i=1;i<=diff;i++){
                tempA=tempA.next;
            }
        }
        else{
            int diff=size2-size1;
            for(int i=1;i<=diff;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempB=tempB.next;
            tempA=tempA.next;
        }
        return tempA;
    }
    public static void main(String[] args) {
        Node a=new Node(43);
        Node b=new Node(30);
        Node c=new Node(433);
        Node d=new Node(423);
        Node e=new Node(438);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node f=new Node(431);
        Node g=new Node(413);
        f.next=g;
        g.next=d;
        d.next=e;

        System.out.println(findInter(a,f).data);

    }
}
