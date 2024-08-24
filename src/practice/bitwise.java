package practice;


public class bitwise {
    public static void main(String[] args) {
        int a=5;    //1100

        int b=6;   // 110
        System.out.println(a^b); //xor
        System.out.println(a&b);  //and
        System.out.println(a|b); //or

        System.out.println(a<<4);  //  a*2^b always multipy by 2
        System.out.println(a>>3);  //  a/2^2  always divided by 2
    }
}
