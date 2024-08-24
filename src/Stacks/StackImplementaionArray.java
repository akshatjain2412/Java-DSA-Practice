package Stacks;

public class StackImplementaionArray {
    public static class Stack{
        private int capacity=100;
        private int top=-1;
        private int []arr=new int[capacity];
        Stack(){


        }
        Stack(int capacity){

            this.arr=new int[capacity];
        }
        int size()
        {
            return top+1;
        }
        boolean isempty(){
            return top<0;
        }
        boolean isfull(){
            return top==capacity-1;
        }
        void push(int data){
            if(isfull()) {
                return;
            }
            else {

                arr[++top] = data;
            }
        }
        int pop(){
            if(isempty()) {
                System.out.println("StackUnderflow");
                return -1;
            }
            else
            {
                int val=arr[top];
                top--;
                return val;
            }
        }
        int peek(){
            if(isempty()){
                return -1;
            }
            return arr[top];
        }
        void print(Stack st){
            while(st.size()!=0){
                System.out.println(st.pop());
            }
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack(10);
        st.push(23);
        st.push(3);
        st.push(234);
        st.push(33);
        st.pop();
        st.pop();
        System.out.println("  "+st.peek());
        st.print(st);
    }
}
