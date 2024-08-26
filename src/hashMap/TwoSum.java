package hashMap;

import java.util.HashMap;

public class TwoSum {
    public static int[] twosum(int arr[],int target)
    {
        int ans[]={-1};
        HashMap<Integer,Integer> twosum=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int partner=target-arr[i];  //partner because a+b=target so a-target=b
            if(twosum.containsKey(partner)){
                ans=new int[2];   //initialize arr with size 2 because of two sum
                ans[0]=i;
                ans[1]=twosum.get(partner);
                return ans;
            }
            twosum.put(arr[i],i);// put value and index
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={14,7,10,4,5,9,1,2};
        int []ans=twosum(arr,13);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
