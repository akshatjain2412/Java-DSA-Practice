package CollectionFrameworks;

//it is same as iterator interface but, it used mainly for legacy class like vector and stack
//three methods
//element() //
//hasMoreElement() //boolean
//nextElement()  //object and jump to next element
//we can use listIterator,Iterator and Enumeration all for leaky class

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class enumeration {
    public static void main(String[] args) {
        Vector v=new Vector();


        v.add(31);
        v.add(23);

        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


        Iterator l=v.iterator();
        while(l.hasNext()){
            l.remove(); // it will give exception we remove element then it called by next line
            System.out.println(l.next());

        }
    }
}
