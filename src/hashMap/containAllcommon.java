package hashMap;

import java.util.HashMap;

public class containAllcommon {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,5};
        int arr1[]={1,1,1,2,2,4,5};

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
            if(frequency.containsKey(b)&&frequency.get(b)>0)
            {
                frequency.put(b,frequency.get(b)-1);
                System.out.println(b);

            }

        }
    }
}
