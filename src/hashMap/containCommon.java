package hashMap;

import java.util.HashMap;

public class containCommon {
    public static void main(String[] args) {
        int arr[]={1,1,2,4,7,3};
        int arr1[]={1,1,1,2,4,2,5};

        HashMap <Integer,Integer>  frequency=new HashMap<>();
          for(int key:arr){
              if(!frequency.containsKey(key))
              {
                  frequency.put(key,1);
              }
          }
          for(int key2:arr1){
              if(frequency.containsKey(key2)){
                  System.out.println(key2);
                  frequency.remove(key2);

              }
          }
    }
}
