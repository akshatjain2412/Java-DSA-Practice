package LikedList;

import java.util.Scanner;
import LikedList.Node;

public class linkedList {
    static Linkedlist ll;

    public static class Linkedlist {
        Node head = null;
        Node tail = null;

       public Linkedlist clone()
        {
            Linkedlist Clone=new Linkedlist();
            Clone.head=ll.head;
            Clone.tail=ll.tail;
            return Clone;
        }

        void addAll(Linkedlist ll2,int idx){
            Node temp=ll.head;
            if(idx==0){
                ll2.tail.next=ll.head;
                ll.head=ll2.head;
                return;
            }
            while(idx-->1){
                temp=temp.next;
            }
            if(ll2.head!=null) {
                ll2.tail.next = temp.next;
                temp.next = ll2.head;
            }
        }
        void addAll(Linkedlist ll2)
        {
            ll.tail.next=ll2.head;
            ll.tail=ll2.tail;
        }

        void deleteStart(){
            try{
                if(head==tail){
                    head=null;
                    tail=null;
                    return;
                }
                head = head.next;
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        void delete(int idx){
            if(idx==0)
            {
                deleteStart();
                return;
            }
            Node temp=head;
            while(idx-->1){
                temp=temp.next;
            }
            if(temp.next==tail){
                deleteLast();
                return;
            }
            temp.next=temp.next.next;
        }
        void deleteLast(){
            Node temp=head;
            if(head==tail){
                head=null;
                tail=null;
                return;
            }
            while(temp.next!=tail)
            {
                temp=temp.next;
            }

            temp.next=null;
            tail=temp;

        }

        void get() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        void addLast(int data){

            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;

        }
        void add(int data)
        {
            addLast(data);
        }

        void add(int data,int idx)
        {
            try{
              Node temp = new Node(data);
              Node t=head;
              if(idx==0){
                  addStart(data);
                  return;
              }
             while(idx-->1)
             {
                 t=t.next;
             }
             if(t.next==null) {
                 addLast(data);
                 return;
             }
                 temp.next = t.next;
                 t.next = temp;

            }
            catch (Exception e)
            {
               System.out.println(e);
            }
        }

        void addStart(int data) {
            Node temp = new Node(data);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }
        void clear(){
            head=null;
            tail=null;
        }

        boolean contains(Node ele)
        {
            Node temp = head;
            if(head.data==ele.data){
                return true;
            }
            while(temp.next!=null){
                if(temp.next.data==ele.data){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
        int size(){
           Node temp=head;
           int size=0;
            if(head ==null){
                return size;
            }
           while(temp.next!=null){
               size++;
               temp=temp.next;
           }

           return size+1;
        }

    }

    static void multipleNode(int num) {
        ll = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            ll.addLast(sc.nextInt());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //multipleNode(num);
        ll=new Linkedlist();

        ll.addStart(67);
//        ll.add(23,1);
//        ll.addLast(342);
//        ll.add(32,3);
//        ll.add(45);

        ll.get();
//        System.out.println();
//        ll.delete(2);
//        ll.deleteStart();
//        ll.deleteLast();
//        Node n2=new Node(63);
//        System.out.println(ll.contains(n2));
//
//        System.out.println();
//        Linkedlist ll2=new Linkedlist();
//        ll2.add(23,0);
//        ll2.add(45,1);
//        ll.addAll(ll2,2);
//        ll.get();
//        Linkedlist ll3=ll.clone();
//
//        System.out.println();
//        ll3.get();
//        System.out.println();
//        ll.addLast(34);
//        ll.get();
//
//        System.out.println();
//        ll3.get();
        System.out.println(ll.size());

    }

}