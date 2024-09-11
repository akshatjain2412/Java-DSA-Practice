package CollectionFrameworks;
import java.util.ArrayList;
//index based structure
//follow insertion order
//can contain heterogeneous data
//we can store duplicate value in it
//its, can contain multiple null values


//total three constructor
//default or empty
//ArrayList(int capacity)
//copy constructor

public class Arraylist {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();//default constructor
        ArrayList list1=new ArrayList(5);//constructor with capacity
        ArrayList list3=new ArrayList(list1); //copy constructor

        //this method is used to add elements in Arraylist
        list.add(0,3278);//add at specific index
        list.add(328989);//add at the end of arraylist
        list.addFirst(10);
        //add element at the first index position
        list.addLast(10);
        //add element at the last index position

        list1.add(null);
        list.add(10);
        list1.add(null);
        //we can see multiple null value
        list1.add("aak");
        //heterogeneous data

        list1.addAll(list);
        //add all element of list to list1
        list1.addAll(1,list);
        //add all element of list to list1 with a specific index

        System.out.println(list1.remove(2));//object
        //it is not possible to direct give integer object because it needs index it thing it is index value

        System.out.println(list1.remove("aak"));  //boolean
        //we can remove objects by object name except integer because in case of integer it takes integer object as an index

        list.removeAll(list1);//boolean value
        //only remove common elements
        //remove all the element of list1 from list
        //it remove all the occurrence of list1 from list it means is list had two same objects and list1 had same object
        //it will remove both of them from list

        System.out.println(list1.removeLast()); //object
        //remove last element in the list

        System.out.println(list1.removeFirst());//object
        //remove first element in the list

        list1.clear();//remove all the element from list

        System.out.println(list.contains(78));//boolean value

        System.out.println(list.containsAll(list1));//boolean value

        System.out.println(list.size());//int value always
        list.add(78);
        System.out.println(list.get(0));//not remove the object
        //it gives object here zero is index of the list

        System.out.println(list.set(0,27878));//object
        //by this method we replace the element in specific index in arraylist

        System.out.println(list.indexOf(44));//it always gives int value if object is not present then it give -1

        //or we can use iterator here

    }
}
