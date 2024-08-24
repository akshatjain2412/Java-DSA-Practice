package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Pge {
    public static int[] pge(int arr[]){
        int []next=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        next[0]=-1;
        for(int i=1;i<arr.length;i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                next[i] = -1;
            }
            else{
                next[i]= arr[st.peek()];
            }
            st.push(i);
        }
        return next;

    }
    public static int[] pge1(int arr[]){
        int []next=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!st.isEmpty()&&arr[i]<arr[st.peek()]){
                int pos=st.peek();
                next[pos]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int pos=st.peek();
            next[pos]=-1;
            st.pop();
        }
        return next;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int [num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        int nxt[]=pge1(arr);
        for(int i=0;i<nxt.length;i++){
            System.out.println(nxt[i]);
        }
    }
}
