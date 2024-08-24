package LikedList;

import java.util.Scanner;


    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }


    public static void throughRec(Node head) {
        if (head == null) return;
        System.out.println(head.data);
        throughRec(head.next);
    }

    public static void itr(Node head) {
        Node temp = head;
        while (temp != null) {
            {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node n=new Node(12);
        Node n2=new Node(13);
        Node n3=new Node(10);
        n2.next=n3;
        n.next=n2;
        throughRec(n);
        itr(n);
    }
}
