package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSwap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(sc.nextInt());
        }
        System.out.println(al);
        int i=0;
        int j=al.size()-1;
        while(i<j){
            Integer temp=al.get(i);
            al.set(i,al.get(j));
            al.set(j,temp);
            i++;
            j--;
        }
        Collections.sort(al);      //inbuilt sort method collection interface
        Collections.reverse(al);   //inbuilt reverse method collection interface
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(Collections.unmodifiableList(al));
    }
}
