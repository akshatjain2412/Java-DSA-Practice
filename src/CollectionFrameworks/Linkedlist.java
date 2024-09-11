package CollectionFrameworks;

//underlying structure is doubly linked list/circular linked list
//index based structure
//follow insertion order
//can contain heterogeneous data
//we can store duplicate value in it
//its, can contain multiple null values
//non synchronized collection
//data consistency not possible

//adv
//fast insertion and deletion in the linked list
//it can go forward and backward both side

//disadvantages
//take extra space for points
//in time of insertion and deletion it needs to manage prev and next both the pointers


//two type of constructor
//default
//copy constructor

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        LinkedList ll1=new LinkedList(ll);

//        add(object)  //boolean
//        add(index, object)  //void
//        addLast()   //void
//        addFirst()  //void
//        addAll(collection)  //boolean
//        addAll(index,collection)  //boolean


//        ll.remove(); //object
//        ll.remove(object);  //boolean and applicable except integers it takes as index
//        ll.remove(index);   //object
//        ll.removeAll(collection);   //boolean
//        ll.removeFirstOccurrence(object); //boolean
//        ll.removeLastOccurrence(object);  //boolean


//         ll.size()  //int value
//         ll.isEmpty() //boolean
//         ll.contains(object)  //boolean
//         ll.containsAll(object collection)  //boolean

//         ll.set(index,object)  //object
//         ll.get(index)  //object
//         ll.indexOf(object)  //int value
//         ll.lastIndexOf(object)  //give last occurrence index int value
//         ll.clear()  //void

//         <--------------------------------------------->
//         these are deque interface methods

//         ll.removeFirst(); //object
//         ll.removeLast     //object

//         ll.getFirst()     //object without removing
//         ll.getLast()      //object without removing

//         ll.addFirst()   //void
//         ll.addLast()    //void

    }
}
