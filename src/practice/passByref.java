package practice;

import java.util.Arrays;

public class passByref {
    void value(int a)
    {
        a=a*10;
    }

    public static void main(String[] args)
    {
        int a=10;
        int arr[]={12,21,21,3,3,57,43,23,64,9};
        Arrays.sort(arr);
        for(int val:arr) {
            System.out.println(val);
        }
         int e= arr.length;
        System.out.println(a);
        passByref p=new passByref();
        p.value(a);
        System.out.println(p);
    }
}
