package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class infixToAny {
    public static String infix(String exp){
        Stack<String> prefix=new Stack<>();
        Stack<String> postfix=new Stack<>();
        Stack<Character> opretor=new Stack<>();
        for (int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                prefix.push(""+ch);
                postfix.push(""+ch);
            }
            else{
                if(opretor.isEmpty()||ch=='('){
                    opretor.push(ch);
                }
                else if(ch==')'){
                    while(opretor.peek()!='('){
                        String val2= prefix.pop();
                        String val1= prefix.pop();
                        String total1=prefix(val1,val2,opretor.peek());
                        prefix.push(total1);
                        String val4= postfix.pop();
                        String val3= postfix.pop();
                        String total2=postfix(val3,val4,opretor.peek());
                        postfix.push(total2);
                        opretor.pop();
                    }
                    opretor.pop();
                }
                else{
                    while(!opretor.isEmpty()&&opretor.peek()!='('&&precedence(ch)<=precedence(opretor.peek())){
                        String val2= prefix.pop();
                        String val1= prefix.pop();
                        String total1=prefix(val1,val2,opretor.peek());
                        prefix.push(total1);
                        String val4= postfix.pop();
                        String val3= postfix.pop();
                        String total2=postfix(val3,val4,opretor.peek());
                        postfix.push(total2);
                        opretor.pop();
                    }
                    opretor.push(ch);
                }
            }
        }
        while(!opretor.isEmpty()){
            String val2= prefix.pop();
            String val1= prefix.pop();
            String total1=prefix(val1,val2,opretor.peek());
            prefix.push(total1);
            String val4= postfix.pop();
            String val3= postfix.pop();
            String total2=postfix(val3,val4,opretor.peek());
            postfix.push(total2);
            opretor.pop();
        }
        return prefix.pop()+" "+postfix.peek();
    }
    public static int precedence(char op1){
        if(op1=='+'){
            return 1;
        }
        else if(op1=='-'){
            return 1;
        }
        else if(op1=='*'){
            return 2;
        }
        else{
            return 2;
        }

    }
    public static String prefix(String val1,String val2,char op){
       return op+val1+val2;
    }
    public static String postfix(String val1,String val2,char op){
        return val1+val2+op;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(infix(s));
    }
    }

