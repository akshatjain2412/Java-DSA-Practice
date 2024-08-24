package LikedList;

import java.util.Stack;

public class palindrome {
    public boolean isPalindromeBrute(Node head) {
        Node temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=st.peek()){
                return false;
            }
            temp=temp.next;
            st.pop();
        }
        return true;
    }
    public Node reverse(Node head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        Node a=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return a;
    }
    public boolean isPalindromeoptimal(Node head) {
        Node slow=head;
        Node fast=head;
        if(head==null){
            return true;
        }
        if(head.next==null){
            return true;
        }
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node a=reverse(slow.next);
        slow.next=a;
        Node p1=head;
        Node p2=slow.next;
        while(p2!=null){
            if(p1.data!=p2.data){
                reverse(a);
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        reverse(a);
        return true;
    }

}
