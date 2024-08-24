package String;

import java.util.Scanner;

public class prcticeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String rt=sc.next();
        sc.nextLine();
        String line = sc.nextLine();
        //
        System.out.println(st.indexOf('a'));//int value
        //
        System.out.println(st.compareTo(rt));// int value according to lexographically
        //
        System.out.println(line);//whole line
        //
        System.out.println(st.contains("aksh"));//boolean
        //
        System.out.println(st.toUpperCase());//
        //
        System.out.println(st.toLowerCase());
        //
        System.out.println(st.concat(rt));//merge string in st

        st+="aks";   //string
        st+='r';     //char
        st+=10;      //int
        System.out.println(st);

        String str="abcde";
        System.out.println(str.substring(2));// here 2 is included
        System.out.println(str.substring(0,3));//  abc  //0 is included and 3 is excluded here

    }
}
