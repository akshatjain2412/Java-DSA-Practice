package String;

public class Immutable {
    public static void main(String[] args) {
        String s="hello";
        // s.charAt(0)='D';  //this is not valid.
        System.out.println(s);

        s=s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);


        String str="a";// it increase wastage of memory
        //because each time we add a char new space will we assign  which reduce performance
        str+='b';
        str+='c';
        System.out.println(str);

        String st="hello";
        String gt="hello";
        String rt=new String("hello");

        System.out.println(st==gt); // this gives true because both st and gt have same memory location
        System.out.println(gt==rt);  //  this give false because diff location because of new key word
        System.out.println(st.equals(gt)); //here
    }
}
