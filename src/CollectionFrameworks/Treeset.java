package CollectionFrameworks;

//it main advantage it follow sorting order
//it does not allow any null values
//it is not an index based data structure
//it can not be store duplicates
//it is not synchronized
//it implement set and sorted interface but directly implements navigableSet
//only store homogeneous data it needs to do comparison to achieve sorting order
//always sort in infix order
//+ve if current object is greater
//-ve if current object is smaller
//0 if current object is equal


//4 constructor
//default
//TreeSet(collection)
//TreeSet(comparator)
//TreeSet(Sorted s)

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();

        ts.add(321);    //boolean
        ts.addAll(Set.of(34,43,334));   //boolean

        ts.remove(34);  //boolean
        ts.removeAll(Set.of(332));  //boolean
        System.out.println(ts.removeFirst());  //int in this case
        System.out.println(ts.removeLast());   //int in this case

        System.out.println(ts.isEmpty());  //boolean
        ts.clear();
        System.out.println(ts.ceiling(15));  //it will find the next greater value possible in TreeSet
        System.out.println(ts.size());  //int value always
        System.out.println(ts.floor(23));    //it will find the next smaller value possible in TreeSet

        System.out.println(ts.contains(324));  //boolean
        System.out.println(ts.containsAll(Set.of(43,35)));   //boolean

        Iterator<Integer> itr=ts.descendingIterator();//it will give reverse iterator values
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(ts.first());  //it gives object value
        System.out.println(ts.last());   //it gives object value
        System.out.println(ts.pollFirst());  //it gives object value
        System.out.println(ts.pollLast());   //it gives object value

        Set<Integer> ts1=ts.descendingSet();  //it gives set
        System.out.println(ts1);

        System.out.println(ts);

    }
}
