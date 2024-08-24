package Stacks;


import java.util.Stack;
import java.util.Scanner;

public class InsertAtbottom {
    public static void InsertAtbott(Stack <Integer>st ,int val,int idx){
        Stack <Integer> gt=new Stack<>();
       try {
           for (int i = st.size(); i > idx; i--) {
               gt.push(st.peek());
               st.pop();
           }
           st.push(val);
           while (gt.size() != 0) {
               st.push(gt.pop());
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
    public static void  insert(Stack <Integer> st,int num){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<num;i++){
            st.push(sc.nextInt());
        }

    }
    public static void print(Stack <Integer> st){
        int []arr=new int[st.size()];
       while(st.size()!=0) {
           System.out.println(st.peek());
           arr[st.size()-1]=st.pop();
       }
       for(int val:arr){
           st.push(val);
       }

    }
    public static void printec(Stack<Integer> st)
    {
        if(st.size()==0){
            return;
        }
        int x=st.pop();
        System.out.println(x);
        printec(st);
        st.push(x);
    }
    public static void revprintec(Stack<Integer> st)
    {
        if(st.size()==0){
            return;
        }
        int x=st.pop();
        revprintec(st);
        System.out.println(x);
        st.push(x);
    }
    public static void pushAtbottom(Stack<Integer> st,int idx,int val)
    {
        if(idx==st.size()){
            st.push(val);
            return;
        }
        int x=st.pop();
        pushAtbottom(st,idx,val);
        st.push(x);
    }
    public static void popAtbottom(Stack<Integer> st,int idx)
    {
        if(idx+1==st.size()){
            st.pop();
            return;
        }
        int x=st.pop();
        popAtbottom(st,idx);
        st.push(x);
    }
    public static void print1(Stack <Integer> st){
        Stack <Integer> gt=new Stack<>();
        while(st.size()!=0) {
            int val=st.peek();
            System.out.println(val);
            gt.push(st.pop());
        }
        while(gt.size()!=0){
            st.push(gt.pop());
        }
    }

    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        insert(st,5);
        Stack <Integer> gt=new Stack<>();

        revprintec(st);
        System.out.println();
        InsertAtbott(st,18,4);
        popAtbottom(st,0);
        print1(st);

    }
}
