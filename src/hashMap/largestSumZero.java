package hashMap;

import java.util.HashMap;

public class largestSumZero {
    public static int[] prefixsum(int []arr)
    {
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
            arr[i]=sum;
        }
        return arr;
    }
    public static int largest(int []pre){
        HashMap<Integer,Integer> lar=new HashMap<>();
        int max=0;
        for(int i=0;i<pre.length;i++)
        {
            if(lar.containsKey(pre[i]))
            {
               max=Math.max(max,i-lar.get(pre[i])) ;
            }
            else {
                lar.put(pre[i], i);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int []arr={15,-2,2,-8,1,7,10};
        int pre[]=prefixsum(arr);
        System.out.println(largest(pre));
    }
}
