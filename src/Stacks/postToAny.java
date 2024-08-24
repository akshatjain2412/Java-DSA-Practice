package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class postToAny {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(postfix(s));
    }

    public static String postfix(String s) {
        Stack<String> pre = new Stack<>();
        Stack<String> in = new Stack<>();
        Stack<String> post = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

          if(Character.isDigit(ch)){
              String co=String.valueOf(ch);
              pre.push(co);
              in.push(co);
              post.push(co);
          }

          else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
              String co=String.valueOf(ch);

              String v2=in.pop();
              String v1=in.pop();
              String inf =infix(v1,v2,co);
              in.push(inf);

              String v4=pre.pop();
              String v3=pre.pop();
              String pref =prefix(v3,v4,co);
              pre.push(pref);


              int v6=Integer.parseInt(post.pop());
              int v5=Integer.parseInt(post.pop());
              int postf =postfi(v5,v6,ch);
               String a=String.valueOf(postf);
              post.push(a);

          }

        }
        return pre.pop()+" "+in.pop()+" "+ post.pop();
    }
    public static String infix(String v1,String v2,String op) {

        return '('+v1+op+v2+')';
    }
    public static String prefix(String v1,String v2,String op) {

        return op+v1+v2;
    }
    public static int postfi(int v1,int v2,char op) {

        if(op=='+'){
            return v1+v2;
        }
        else if(op=='-'){
            return v1-v2;
        }
        else if(op=='*'){
            return v1*v2;
        }
            return v1/v2;
    }


}

