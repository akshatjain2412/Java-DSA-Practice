package CollectionFrameworks;
//Iterator have total 3 method
//hasnext()  //boolean
//next()  //object
//remove() //void

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Interator {
    public static void main(String[] args) {
        Set set=new HashSet();
        //it will not follow insertion order because of set
        set.add(19);
        set.add(28);
        set.add(123);

        Iterator itr= set.iterator();  //it is iterator interface reference and put set with iterator function
        //it has a cursor pointed up from first the element then first element then in between two object
        while(itr.hasNext()){  //it gives true value if next element present in the Set
            System.out.println(itr.next()); //give object value until loop is not complete
        }
    }
}
