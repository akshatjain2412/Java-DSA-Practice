package StringBuilder;

import java.util.Scanner;

public class ToggleLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());  // we use Scanner class in constructor
        //sb=sc.nextLine();//not used it will give error
        System.out.println(sb);
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            int asci= ch;
            if(ch==' '){     // if we don't use this then it will give toggle value of the ' '
                continue;
            }
            if(asci<97){   //here 97='a' in asci
                asci+=32;          //this is the diff between a and A which is 32
                char a=(char)asci;
                sb.setCharAt(i,a);
            }
            else{
                asci-=32;
                char a=(char)asci;
                sb.setCharAt(i,a);
            }
        }
        System.out.println(sb);

    }
}
