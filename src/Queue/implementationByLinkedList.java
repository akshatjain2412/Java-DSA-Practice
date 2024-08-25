package Queue;

public class implementationByLinkedList {
  public static class LinkedList {
        Node head=null;
        Node tail=null;
        int size=0;
      public static class Node {
          int data;
          Node next;

          Node(int data) {
              this.data = data;
          }
      }
       void add(int val){
          Node a=new Node(val);
          if(head==null){
            head=a;
            tail=a;
            size++;
            return;
          }
              tail.next=a;
              tail=tail.next;
              size++;
       }
       int poll(){
          if(head==null){
              return -1;
          }
          if(head==tail){
              int val= head.data;
              head=null;
              tail=null;
              size--;
              return val;
          }

              int val=head.data;
              head=head.next;
              size--;
              return val;
       }
       int peek(){
          return head.data;
       }
       int size(){
          return this.size;
       }
       boolean isEmpty(){
          return this.size==0;
       }
  }

    public void print(LinkedList ll) {
        while (!ll.isEmpty()) {
            System.out.println(ll.poll());
        }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(21);
        ll.add(13);
        ll.add(31);
        implementationByLinkedList al=new implementationByLinkedList();
        al.print(ll);

    }

}
