package hashMap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(11,234);//it inserts the k-v in hashtable
        hm.put(2,123);
        hm.put(2,221);//if we try to put key value which is present already in hashtable then it replace with new
        System.out.println(hm.get(2));//it gives value of that key
        System.out.println(hm.get(34));//it gives null if key is not present if we get
        System.out.println(hm.containsValue(2));//boolean value
        System.out.println(hm.containsKey(12));//boolean value
        System.out.println(hm.remove(2));//it checks key if present then give int value and remove
        System.out.println(hm.remove(2,33));//it checks both k-v if present then remove
        System.out.println(hm.isEmpty());//boolean value
        System.out.println(hm.size());//2
        System.out.println(hm.values());//set of all values in hashmap
        System.out.println(hm.keySet());//set of all keys in hashmap
        System.out.println(hm.entrySet());//set of all key value pair in hashmap
        System.out.println(hm.hashCode());//give hashcode value
        System.out.println(hm.replace(2,78));//print older value and set new value
        System.out.println(hm.replace(4,78,0));//if old value is not present then it give false value otherwise true
        System.out.println(hm.getOrDefault(1,15));
        System.out.println(hm.get(1));
        System.out.println(hm);
    }
}
