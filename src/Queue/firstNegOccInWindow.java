package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class firstNegOccInWindow {
    public static int[] window(int arr[],int k,int n){
        int res[]=new int[n-k+1];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                q.add(i);
            }
        }
        for(int i=0;i<n-k+1;i++){
            if(q.size()>0&&q.peek()<i)q.remove();
            if(q.size()>0&&q.peek()<=i+k-1){
                res[i]=arr[q.peek()];
            }
            else if(q.size()>0&&q.peek()>i){
                res[i]=0;
            }
            else{
                res[i]=0;
            }
        }
        return res;
    }
    public static void main(String[] args) {
            int arr[]={12,-1,-7,8,-15,30,16,28};
            int k=3;
            int res[]=window(arr,k, arr.length);
            for(int i=0;i< res.length;i++){
                System.out.println(res[i]);
            }
    }
}
