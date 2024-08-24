package Recursion;

public class FrogJump {
    public static int sum(int arr[],int idx){
        if(idx==arr.length-1){
            return 0;
        }
        int op=sum(arr,idx+1)+Math.abs(arr[idx]-arr[idx+1]);
        if(idx==arr.length-2){
            return 0;
        }
        int op2=sum(arr,idx+1)+Math.abs(arr[idx]-arr[idx+2]);
        return Math.min(op,op2);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,60,80,70};
        System.out.println(sum(arr,0));
    }
}
