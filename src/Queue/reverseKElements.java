package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverseKElements {
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int val= q.poll();
        reverse(q);
        q.add(val);
    }
    public static void reverse(Queue<Integer> q,int k){
        int n=q.size();
        if(n-k==0){
            return;
        }
        int val= q.poll();
        reverse(q,k-1);
        q.add(val);
    }
    public static void StackReverse(Queue<Integer> q,int k){
        Stack<Integer> st=new Stack<>();
        while(q.size()>k){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
    public static void StackReverse(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        while(q.size()>0){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(42);
        q.add(20);
        q.add(213);
        q.add(22);
        q.add(21);
        System.out.println(q);
        //method 1
        reverse(q);
        System.out.println(q);  //first reverse all the elements
        StackReverse(q,4);
        System.out.println(q);  //then again reverse only k elements

        //Method 2
        StackReverse(q);//same method
        System.out.println(q);
        reverse(q,4);
        System.out.println(q);


    }
}
