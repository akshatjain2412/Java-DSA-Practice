package Stacks;
import java.util.Stack;
public class CelebrityPro {
    public static void main(String[] args) {
        int num=5;
        int [][]mat={{1,1,1,1,0},{0,0,0,0,0},{1,1,1,1,0},{1,1,0,1,0},{0,1,1,1,1}};
       celebrity(mat);

    }
    public static void celebrity(int mat[][]){
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int pot=-1;
        for(int i=1;i<mat.length;i++){
             st.push(i);
             int j=st.pop();
             int in=st.pop();
          if(mat[in][j]==1){   // in this case the we check is 'in' knows celeb
              st.push(j);
          }
          else {
              st.push(in);      //in this case 'in' may be our celeb
          }
           pot=st.peek();
        }
        for (int i = 0; i < mat.length; i++) {
            if(mat[pot][i]!=0){
                System.out.println("none");
                break;
            }
            else{
                System.out.println(pot);
                break;
            }
        }


    }
}
