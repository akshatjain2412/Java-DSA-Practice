package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reorderQueue {
    public static Queue<Integer> reorder(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        int n=q.size();
        for(int i=1;i<=(n/2);i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=1;i<=(n/2);i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.poll());
        }
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(reorder(q));
    }
}
