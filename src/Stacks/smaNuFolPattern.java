package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class smaNuFolPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        smallestFollowing(s);
    }

    private static void smallestFollowing(String s) {
        Stack<Integer> st=new Stack<>();
        int count=1;
        for (int i = 0; i <s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='d'){
                st.push(count);
                count++;

            }

            else if(ch=='i'){
                st.push(count);
                while(!st.isEmpty()){
                    System.out.println(st.pop());

                }
                count++;
             }


            }
        if(s.charAt(s.length()-1)=='d'||s.charAt(s.length()-1)=='i'){

            st.push(count);

        }
        while(!st.isEmpty()){

            System.out.println(st.pop());
        }
        }

    }

