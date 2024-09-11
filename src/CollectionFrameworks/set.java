package CollectionFrameworks;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//it can't maintain insertion order
//no duplicates
//only one null exist
//only iterate through Iterator
//it insert element on the basis of hashcode value
//can contain heterogeneous value

public class set {
    public static void main(String[] args) {
        Set s=new HashSet();
        List s2=new ArrayList<>();

        s.add(19);
        //add element in set by the use if hashcode value

        s2.add(18);
        //add element in list

        s.addAll(s2);
        //add all the element of any specific collection to another collection

        System.out.println(s.size());//it gives always int value
        //give size of set

        System.out.println(s.isEmpty());//boolean value
        //check size of set is zero or not

        System.out.println(s.containsAll(s2));//boolean value
        //check contain all the element from specific collection to another

        System.out.println(s.contains(18));//boolean value
        //check contains specific value in set or not

        System.out.println(s.remove(18));
        //remove the object in set

        System.out.println(s.removeAll(s2));
        //remove all the element of a set by use of specific collection

        System.out.println( s.iterator());
    }

}
