package CollectionFrameworks;

import java.util.ArrayList;
//collection is a interface so we can't use directly so, we use Arraylist here because it is a class which implements list interface
public class collectionMethod {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);   //add is a collection interface method
        al.add("rahul");
        al.add(22);

        ArrayList list2=new ArrayList();
        list2.add(22);
        list2.add("12oi");

        list2.remove(1);//need index value to remove

        al.addAll(list2);
        //removeAll is boolean method if there is no element present to remove then it will print boolean value

        al.removeAll(list2); //remove all element of a collection from another class
        //it's we remove all the object of list2 present in al

        System.out.println(al);//addAll is a collection method which is used add all objects of one collection to another


        System.out.println(al.contains(89));//boolean value if contains or not

        System.out.println(al.containsAll(list2));//check all the object in al contains list2 object and give boolean value

        System.out.println(al.isEmpty());//to check the size of collection is zero or not  which give boolean value

        System.out.println(al.size());//to check how many present in data structure gives int value

        al.clear();//this is collection interface method to clear the collection
         }
}
