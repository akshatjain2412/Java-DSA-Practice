package Stacks;

import java.util.Stack;

public class copyStack {
    public static Stack<Integer> copystack(Stack<Integer> st){
        Stack <Integer> rt=new Stack<>();
        while(st.size()!=0){
            rt.push(st.peek());
            st.pop();
        }
        Stack <Integer> gt=new Stack<>();
        while(rt.size()!=0){
            gt.push(rt.peek());
            rt.pop();
        }
        return gt;
    }
    public static void print(Stack<Integer> gt){
        while(gt.size()!=0){
            System.out.println(gt.pop());
        }
    }
    public static void main(String[] args) {
        Stack <Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        Stack <Integer>gt=copystack(st);
        print(gt);



    }
}
