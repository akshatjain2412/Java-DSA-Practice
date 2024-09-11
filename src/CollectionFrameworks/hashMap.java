package CollectionFrameworks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Hash map have key-value pair called entry
//it uses hashtable to store data
//it implements Map interface
//it can store only one null value in key and can store multiple values in value set
//it does not follow insertion and sorting order
//key must be unique


//has 4 constructor
//default
//Hashmap(Map)
//HashMap(initial capacity) //buckets
//HashMap(initial capacity ,load factor)

public class hashMap {
    public static void main(String[] args) {
        HashMap <Integer,Integer>  hm=new HashMap<>();
        hm.put(21,32);   //decided by object type
        hm.put(23,232);  //decided by object type

        hm.values();     //collection of all value set
        hm.keySet();     //collection of all key set
        hm.entrySet();   //collection of all entries in the Map

        hm.get(324);     //give value with respect to this key
        hm.containsKey(34);   //boolean value according to key set
        hm.containsValue(32);  //boolean value according to value Set
        hm.remove(44);    //remove and give object value with respect to this key value
        hm.remove(2,234);      //remove a particular entry boolean
        //hm.putAll(Map);      //put all the element of Map in hm

        hm.replace(2,23);       //it put new value in map and give old object value
        hm.replace(2,213,34);  //it put new value with respect to entry and give boolean value

        //new way but it needs generic
        for(Map.Entry a:hm.entrySet()){
            System.out.println(a.getKey()+ "   " +a.getValue());  //these two method is only use here
        }

        Set set=hm.entrySet();

        Iterator itr=set.iterator();

        while(itr.hasNext()){
            Map.Entry ent=(Map.Entry)itr.next();
            System.out.println(ent.getKey()+"   "+ent.getValue());
        }
    }
}
