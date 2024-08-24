package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class span {
    public static int[] span(int arr[]){
        int nxt[]=new int[arr.length];
        Stack <Integer> st=new Stack<>();
        nxt[0]=1;
        st.push(0);
        for(int i=1;i<arr.length;i++) {

            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()){
                nxt[i]=i+1;
            }
            else{
                nxt[i]=i-st.peek();
            }
            st.push(i);
        }

        return nxt;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int [num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        int nxt[]=span(arr);
        for(int i=0;i<nxt.length;i++){
            System.out.println(nxt[i]);
        }
    }
}

