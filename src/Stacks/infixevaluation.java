package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class infixevaluation {
    public static int infixEval(String exp){
        Stack<Integer> oprend=new Stack<>();
        Stack<Character> opretor=new Stack<>();
        for(int i=0;i<exp.length();i++){
          char ch=exp.charAt(i);
            if((int)ch >=48 && (int)ch <=57){
              oprend.push((int)ch -48);
          }
          else {
                if (opretor.isEmpty()||ch=='(') {
                    opretor.push(ch);
                }
                else if(ch==')'){

                    while(opretor.peek()!='('){
                        int val2 = oprend.pop();
                        int val1 = oprend.pop();
                        char op = opretor.pop();
                        int total = operation(val1, val2, op);
                        oprend.push(total);
                    }
                    opretor.pop();
                }
                else {
                    while (!opretor.isEmpty() && opretor.peek()!='(' && precedence(ch) <= precedence(opretor.peek())) {
                        int val2 = oprend.pop();
                        int val1 = oprend.pop();
                        char op = opretor.pop();
                        int total = operation(val1, val2, op);
                        oprend.push(total);

                    }
                    opretor.push(ch);
                }
            }
        }
        while(!opretor.isEmpty()){
            int val2=oprend.pop();
            int val1=oprend.pop();

            int total=operation(val1,val2,opretor.pop());
            oprend.push(total);
        }
        return oprend.pop();
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
    public static int operation(int val2,int val1,char op){
        if(op=='+'){
            return val2+val1;
        }
        else if(op=='-'){
            return val2-val1;
        }
        else if(op=='*'){
            return val2*val1;
        }
        else{
            return val2/val1;
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String exp=sc.next();
        System.out.println(infixEval(exp));
    }

}
