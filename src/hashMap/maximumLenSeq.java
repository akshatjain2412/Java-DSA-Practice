package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class maximumLenSeq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int []arr=new int[len];
        for (int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Boolean> hm=new HashMap<>();

        for (int val:arr)
        {
            hm.put(val,true);
        }

        for (int val:arr)
        {
            if(hm.containsKey(val-1))
            {
                hm.put(val, false);
            }
        }
        int max=0;
        int msp=0;
        for(int val:arr)
        {
            if(hm.containsValue(true))
            {
                int tsp=val;
                int t1=1;
                while(hm.containsKey(tsp+t1))
                {
                    t1++;
                }
                if(t1>max)
                {
                    max=t1;
                    msp=tsp;

                }
            }

        }
        System.out.println(max);
        System.out.println(msp);
    }
}
