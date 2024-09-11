package CollectionFrameworks;

import java.util.ArrayList;
import java.util.List;

//it maintains insertion order
//it preserves index of each object
//it may have duplicate values
//it can have multiple null value in it
//its,can use both iterator & list iterator



public class ListDemo {
    public static void main(String[] args) {
        List a=new ArrayList<>(); //list is a interface so, we use ArrayList class to implement it
        List list1=new ArrayList();//another one

        a.add(29);
        //add value or object at the end of the List
        a.add(1,31);
        //we acn add object any specific index if this index not present in the list it will give exception index out of bound
        a.addAll(1,list1);
        //we can all the element of a specific list to another list with specific index
        a.addAll(list1);
        //we can all the element of a specific list to another list


        System.out.println(a.remove(0));//it gives object value
        //remove element with specific index

        System.out.println(a.removeAll(list1));
        //remove all object of specific list

        System.out.println(a.get(0));//it return object value
        //it gets the specific element from specific index
        a.add(29);

        System.out.println(a.indexOf(29));//it gives int value
        //it will give index value of specific value if it presents in that list if not it give -1

        System.out.println(a.lastIndexOf(787));//it always gives int value
        //it will give last occurrence index value of specific object if not it give -1

        System.out.println(a.subList(0,1));
        //it will make a sublist  with starting and ending index in which staring index is inclusive and ending index is exclusive
    }
}
