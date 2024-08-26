package Hashset;

import java.util.HashSet;

public class lenOfConsecutiveElement {
    public static int lenofconse(int []arr)
    {
        HashSet<Integer> len=new HashSet<>();
        int length=0;
        int max1=0;
        for(int i=0;i<arr.length;i++)
        {
            len.add(arr[i]);//remove duplicate
        }
        for(int num:len) {
            if (!len.contains(num-1)) {  //check if num's previous already not exist
                int curr = num;
                max1=1;  //then one
                while (len.contains(curr + 1)) {//check until consecutive not exist
                    curr++;
                    max1++;
                }
                length = Math.max(length, max1);//update maximum len
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int arr[]={99,1,100,4,200,1,2,2,3};
        System.out.println(lenofconse(arr));
    }
}
