package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class maximumAreaHisto {
    public static int[] nse(int arr[]) {
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int pos = st.peek();
                nse[pos] = i;
                st.pop();
            }
            st.push(i);
        }
        while ((!st.isEmpty())) {
            int pos = st.peek();
            nse[pos] = arr.length;
            st.pop();
        }
        return nse;
    }

    public static int[] pse(int arr[]) {
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        pse[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                pse[i] = st.peek();
            } else {
                pse[i] = -1;
            }
            st.push(i);
        }
        return pse;
    }

    public static int histogram(int arr[]){

    int pse[] = pse(arr);
    int nse[] = nse(arr);
    int max=Integer.MIN_VALUE;
    for(int i=0;i< arr.length;i++){
        if(pse[i]+nse[i]>max){
            max=pse[i]+nse[i];
        }
    }
    return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int [num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println(histogram(arr));
        int nxt[]=nse(arr);
        for(int i=0;i<nxt.length;i++){
            System.out.println(nxt[i]);
        }
    }
}
