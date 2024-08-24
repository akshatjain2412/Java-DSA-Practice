package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class Nge {
    public static int[] solve(int arr[]){
        int nx[]=new int[arr.length];
        Stack <Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        nx[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while (!st.isEmpty()&& arr[i]>=st.peek()) {
                st.pop();
            }
            if(st.isEmpty())
                nx[i]=-1;
            else
                nx[i]=st.peek();
            st.push(arr[i]);
        }

        return nx;
    }
    public static int[] nge(int arr[]){
        int []next=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty()&&arr[st.peek()]<arr[i]){
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

        int nxt[]=nge(arr);
        for(int i=0;i<nxt.length;i++){
            System.out.println(nxt[i]);
        }
    }
}

