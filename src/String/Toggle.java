package String;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();  // we use Scanner class in constructor
            //sb=sc.nextLine();//not used it will give error
            String g="";
            System.out.println(s);
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                int asci= ch;
                if(ch==' '){     // if we don't use this then it will give toggle value of the ' '
                    g+=" ";      //this used to provide space in g string because it add all character
                    continue;
                }
                if(asci<97){   //here 97='a' in asci
                    asci+=32;          //this is the diff between a and A which is 32
                    char a=(char)asci;
                    g+=a;
                    s=s.substring(0,i)+a+s.substring(i+1);
                }
                else{
                    asci-=32;
                    char a=(char)asci;
                    g+=a;
                    s=s.substring(0,i)+a+s.substring(i+1);
                }
            }

            System.out.println(g);//this is extra space approach

            System.out.println(s);//this is normal

        }

}
