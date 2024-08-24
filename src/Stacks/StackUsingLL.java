package Stacks;

public class StackUsingLL {
    public static class LinkedList {
        Node head=null;
        Node tail=null;
        int size;
        public  class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }
        void push(int data){

            Node val=new Node(data);
            if(head==null){
                head=val;
                tail=val;
            }
            tail.next=val;
            tail=tail.next;
            size++;
        }
        int pop(){
            if(isempty()){
                return -1;
            }
            if(head.next==null){
                int val=head.data;
                head=null;
                tail=null;
                return val;
            }
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            int val=tail.data;
            size--;
            temp.next=null;
            tail=temp;
            return val;
        }
        int peek(){
            return tail.data;
        }
        int size(){
            return this.size;
        }
        boolean isempty(){
            return head==null;
        }
        void print(Node head){
            if(head==null){
                return;
            }
            print(head.next);
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.push(324);
        ll.push(34);
        ll.push(33);
        System.out.println(ll.peek());
        ll.pop();
        ll.print(ll.head);
    }

}
