package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class slidingwindow {
    public static void slidingwindow(int arr[],int slide){
        int nxt[]=new int[arr.length];
        Stack <Integer> st=new Stack<>();
        st.push(arr.length-1);
        nxt[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i-- ) {

            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()){
                nxt[i]=arr.length;
            }
            else{
                nxt[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(nxt[i]);
        }
        int  j=0;
        for(int i=0;i<= arr.length-slide;i++){

                if(j<i) {
                    j = i;
                }
                while(nxt[j]<i+slide){
                j=nxt[j];
                }
            try {
                System.out.println(arr[j]);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int slide=sc.nextInt();
        int num=sc.nextInt();
        int arr[]=new int [num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        slidingwindow(arr,slide);

    }
}

