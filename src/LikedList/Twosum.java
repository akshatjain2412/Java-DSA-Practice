package LikedList;

public class Twosum {
    static boolean twoSum(Node head,int target) {
        Node num1=head;
        Node num2=head.next;
        while (num1.next!=null){
            while(num2!=null){
                if(num1.data+num2.data==target){
                    return true;
                }
                num2=num2.next;
            }
            num1=num1.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println(twoSum(a,19));
    }
}
