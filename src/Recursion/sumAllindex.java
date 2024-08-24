package Recursion;

public class sumAllindex {
    public static void sum(int arr[],int idx,int sum){
        if(idx>=arr.length){
            System.out.print(sum+" ");
            return;
        }
        sum(arr,idx+1,sum);
        sum(arr,idx+1,sum+arr[idx]);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5};
        sum(arr,0,0);
    }
}
