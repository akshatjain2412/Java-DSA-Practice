package Stacks;

import java.util.Stack;

public class RemoveConsecutive {
    public static void removeConsecutive(int arr[]) {
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.isEmpty() || st.peek()!=arr[i]) {
                st.push(arr[i]);
            }
        }
        while(st.size()>0){
            System.out.println(st.pop());
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,2,10,10,10,4,4,4,5,7,7,2};
        removeConsecutive(arr);
    }
}
