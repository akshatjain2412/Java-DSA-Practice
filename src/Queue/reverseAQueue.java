package Queue;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class reverseAQueue {
    public static void reverse(Queue<Integer>q){
        if(q.isEmpty()){
            return;
        }
        int val= q.poll();
        reverse(q);
        q.add(val);
    }
    public static void StackReverse(Queue<Integer> q){
        Stack <Integer> st=new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        reverse(q);

        System.out.println(q);//reverse the values
        StackReverse(q);
        System.out.println(q); //it again reverses the values
    }
}
