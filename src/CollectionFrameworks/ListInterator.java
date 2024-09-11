package CollectionFrameworks;

//Iterator have total 5 method
//hasNext()  //boolean
//next()  //object
//remove() //void
//hasPrevious() //boolean
//previous()  //object

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;

public class ListInterator {
    public static void main(String[] args) {
        List list=new ArrayList<>();

        list.add(37);
        list.add(43);
        list.add(32);


        ListIterator litr=list.listIterator();//this is same as Iterator method but, it uses for list collection
        while(litr.hasNext()){
            System.out.println(litr.next());
        }

        ListIterator litr1=list.listIterator();
        //same as upper one
        while(litr1.hasNext()){ //cursor always points before first element to use previous methods this we need to reach our pointer at the last position
            litr1.next();
        }
        // it gives reverse order element
        while(litr1.hasPrevious()){//loop until this condition true
            System.out.println(litr1.previousIndex()); //print previous index gives int value
            litr1.previous();//jump to previous index value
            //to print values then
            //System.out.println(litr1.previous());

        }

    }
}
