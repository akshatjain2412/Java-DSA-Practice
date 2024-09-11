package CollectionFrameworks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
//underlying Structure of hashset is hashtable
//it is not a index based data structure it use hashcode to uniquely identify any object to store
//it is not maintain insertion order
//it is not maintain sorting
//duplicates can't be present inside it
//only one null value allow
//it uses set interface
//heterogeneous data can be stored inside it
//initial capacity of hashset is 16 and load factor is 0.75


//they have 4 constructors
//default
//Hashset(collection)  //it may be any possible collection
//Hashset(initial capacity)
//Hashset(initial capacity ,load factor)

public class Hahset {
    public static void main(String[] args) {
        HashSet hs=new HashSet(12,0.75f);
        Set hs1 = Set.of(33,34,423,324);


        hs.add(7678);   //boolean
        hs.add(324);    //boolean
        hs.add(null);    //boolean
        hs.addAll(hs1); //boolean

        System.out.println(hs);

        hs.remove(4345);  //boolean
        hs.removeAll(hs1);   //boolean

        System.out.println(hs);

        System.out.println(hs.contains(33));   //boolean
        System.out.println(hs.containsAll(hs1));  //boolean
        System.out.println(hs.isEmpty());    //boolean
        System.out.println(hs.size());       //int

        System.out.println(hs);
        hs.clear();

        System.out.println(hs);




    }
}
