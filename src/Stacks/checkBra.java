package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class checkBra {
    public static boolean check(String s){
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch==')'){
                if(!st.isEmpty()&&st.peek()=='(') {
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                if(ch=='(') {
                    st.push(ch);
                }
            }
        }
        if(!st.isEmpty()) {
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean Allcheck(String s){
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

                  if(st.isEmpty()||ch=='('||ch=='{'||ch=='['){
                     st.push(ch);
                 }
                 else {
                     if (ch == ')' && st.peek() == '(' || ch == '}' && st.peek() == '{' || ch == ']' && st.peek() == '[') {
                         st.pop();
                     } else {
                         st.push(ch);
                     }
                 }
            }
        if(!st.isEmpty()) {
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Allcheck(s));

    }
}
