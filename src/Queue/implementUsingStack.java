package Queue;

import Stacks.implementUsingQueue;

import java.util.Stack;

public class implementUsingStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> helper=new Stack<>();
    int poll(){
        return stack.pop();
    }
    int element(){
        return stack.peek();
    }
    void add(int val){
        if(stack.isEmpty()){
            stack.push(val);
        }else{
            while(stack.size()>0){
                helper.push(stack.pop());
            }
            stack.push(val);
            while(!helper.isEmpty()){
                stack.push(helper.pop());
            }
        }
    }
    boolean isEmpty(){
        return stack.isEmpty();
    }
    int size(){
        return stack.size();
    }
    void print(implementUsingStack queue){
        while(queue.size()>0){
            System.out.println(queue.poll());
        }
    }
    public static void main(String[] args) {
        implementUsingStack queue=new implementUsingStack();
        queue.add(31);
        queue.add(432);
        queue.add(42);
        System.out.println(queue.element());
        queue.print(queue);

    }
}
