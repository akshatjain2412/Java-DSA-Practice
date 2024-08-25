package Stacks;

import java.util.ArrayDeque;
import java.util.Queue;

public class implementUsingQueue {
    Queue <Integer>q=new ArrayDeque<>();
    //we want push at o(1)the we use these methods

//    void push(int val){
//        q.add(val);
//    }
//
//    int  pop(){
//        for (int i = 1; i <q.size() ; i++) {
//            q.add(q.poll());
//        }
//        return q.poll();
//    }
//    int peek(){
//        for (int i = 1; i <q.size() ; i++) {
//            q.add(q.poll());
//        }
//        int val=q.poll();
//        q.add(val);
//        return val;
//    }
//    boolean isEmpty(){
//        return q.isEmpty();
//    }
//    int size(){
//        return q.size();
//    }

    //if we want pop at o(n) then use these method


    void push(int val){
        q.add(val);
        for(int i=1;i<q.size();i++){
            q.add(q.poll());
        }
    }
    int  pop(){
        return q.poll();
    }
    int peek(){


        return q.peek();
    }
    boolean isEmpty(){
        return q.isEmpty();
    }
    int size(){
        return q.size();
    }
    void print(implementUsingQueue stack){
        while(stack.size()>0){
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        implementUsingQueue stack=new implementUsingQueue();
        stack.push(123);
        stack.push(221);
        stack.push(213);
        stack.push(324);
//      System.out.println(stack);
        System.out.println(stack.peek());
        stack.print(stack);
    }
}
