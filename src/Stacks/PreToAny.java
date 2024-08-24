package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class PreToAny {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(prefix(s));
    }

    public static String prefix(String s) {
        Stack<String> pre = new Stack<>();
        Stack<String> in = new Stack<>();
        Stack<String> post = new Stack<>();

        for (int i = s.length()-1; i >=0; i--) {
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                String co=String.valueOf(ch);
                pre.push(co);
                in.push(co);
                post.push(co);
            }

            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                String co=String.valueOf(ch);

                String v1=in.pop();
                String v2=in.pop();
                String inf =infix(v1,v2,co);
                in.push(inf);

                String v3=post.pop();
                String v4=post.pop();
                String postf =postfix(v3,v4,co);
                post.push(postf);


                int v5=Integer.parseInt(pre.pop());
                int v6=Integer.parseInt(pre.pop());
                int pref =prefix(v5,v6,ch);
                String a=String.valueOf(pref);
                pre.push(a);

            }

        }
        return pre.pop()+" "+in.pop()+" "+ post.pop();
    }
    public static String infix(String v1,String v2,String op) {

        return '('+v1+op+v2+')';
    }
    public static String postfix(String v1,String v2,String op) {

        return v1+v2+op;
    }
    public static int prefix(int v1,int v2,char op) {

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

