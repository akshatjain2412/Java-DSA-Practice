package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class balanceBrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch==')'){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                }
                else if(st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            if(ch=='}'){
                if(st.size()==0){
                    System.out.print(false);
                    return;
                }
                else if(st.peek()=='{'){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            if(ch==']'){
                if(st.size()==0){
                    System.out.println(false);
                    return;

                }
                else if(st.peek()=='['){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                if(ch=='('||ch=='{'||ch=='[') {
                    st.push(ch);
                }
            }


        }
        System.out.println(st.isEmpty());
    }
}
