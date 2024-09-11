package CollectionFrameworks;


//index based data structure
//insertion order follow but reverse order because of lifo
//not follow sorting
//multiple null present
//heterogeneous data can put
//implemented by arrays, linkedList,ArrayList or vector

import java.util.Stack;

//have mainly five methods
//pop()    object
//peek()   object
//push(object)  object
//size()   int
//isEmpty()  boolean
//isFull()   boolean in case of array implementation


//only one constructor default constructor
//we can use all the list interface method in stack

public class legacyStack {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        System.out.println(st.push(34));
        System.out.println(st.push(23));

        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());

        System.out.println(st.indexOf(34));

        System.out.println(st);
    }
}
