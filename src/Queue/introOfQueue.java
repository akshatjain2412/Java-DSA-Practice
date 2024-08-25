package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class introOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>() ;
        q.add(331); //add value
        q.add(12);
        q.add(1213);
        q.add(28);

        System.out.println(q.remove());//remove and give the value which was delete
        System.out.println(q);
        System.out.println(q.remove(1213)); //remove the value or object and print boolean value
        System.out.println(q);
        System.out.println(q.poll());//remove and give the value which was delete
        System.out.println(q);
        System.out.println(q.peek());//it give the value without removing it
        System.out.println(q);
        System.out.println(q.element());//it give the value without removing it
        System.out.println(q);
        System.out.println(q.size());//int size
        System.out.println(q);
        System.out.println(q.isEmpty());//boolean is q is empty or not
    }
}
