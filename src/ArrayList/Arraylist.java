package ArrayList;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList al2=new ArrayList();
        al2.add("ram");
        al2.add(33.0f);
        al2.add(32);
        System.out.println(al2);
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            al.add(i);
        }


        al.addFirst(5);     //list interface method
        al.addLast(6);      //list interface method
        al.add(0,100);
        al.set(2,500);  // change the value of index 2 0->500
        al.removeFirst();
        al.removeLast();
//        al.removeAll(al);   //collection value to remove list element
        al.remove(0); //index
        al.remove(Integer.valueOf(3));  //object or al.remove(3); but good to write full
        System.out.println(al.remove(Integer.valueOf(6)));
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        System.out.println(al);
        System.out.println(al.contains(Integer.valueOf(5)));
    }
}
