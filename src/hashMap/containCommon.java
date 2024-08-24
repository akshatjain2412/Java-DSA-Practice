package hashMap;

import java.util.HashMap;

public class containCommon {
    public static void main(String[] args) {
        int arr[]={1,1,2,4,7,3};
        int arr1[]={1,1,1,2,4,2,5};

        HashMap <Integer,Integer>  frequency=new HashMap<>();
        for(int a:arr)
        {
            if(frequency.containsKey(a))
            {
                int naya =frequency.get(a)+1;
                frequency.put(a,naya);
            }
            else {
                frequency.put(a,1);
            }
        }

        for(int b:arr1)
        {
            if(frequency.containsKey(b))
            {
                System.out.println(b);
                frequency.remove(b);    // remove because it print the value repetately just like  1  1  1  3  4  2
                //but we need 1,2,4
            }
        }
    }
}
