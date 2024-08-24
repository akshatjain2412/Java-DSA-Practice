package DoublyLInked;

public class palindrome {
    public static boolean isPalindrome(DoublyNode head){
        if(head==null){
            return true;
        }
        DoublyNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        DoublyNode j=temp;
        DoublyNode i=head;
        while(i!=j){
            if(i.data!=j.data){
                return false;
            }
            i=i.next;
            j=j.prev;
        }
        return true;
    }
    public static boolean twosum(DoublyNode head,DoublyNode tail,int target){
        DoublyNode i=head;
        DoublyNode j=tail;
        while(i!=j) {
            if (i.data + j.data == target) {
                return true;
            }
            if (i.data + j.data > target) {
                j = j.prev;
            }
            if (i.data + j.data < target) {
                i = i.next;
            }
        }
            return false;
    }
    public static void main(String[] args) {
        doublylinkedlist dll=new doublylinkedlist();
        dll.addend(1);
        dll.addend(2);
        dll.addend(3);
        dll.addend(4);
        dll.addend(5);
        System.out.println(twosum(dll.head,dll.tail,0));
    }
}
