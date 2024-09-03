package BinaryTree;

import java.util.Stack;

public class Traversal {
    public static void preorderTraverse(Node root)
    {
        if(root==null){
            return ;
        }
        System.out.println(root.val);   // print the value
        preorderTraverse(root.left);    // call for left subtree
        preorderTraverse(root.right);   // call for right subtree
    }
    public static void InTraverse(Node root)
    {
        if(root==null){
            return ;
        }
        InTraverse(root.left);          // call for left subtree
        System.out.println(root.val);   // print the value
        InTraverse(root.right);         // call for right subtree
    }
    public static void postorderTraverse(Node root)
    {
        if(root==null){
            return ;
        }
        postorderTraverse(root.left);   // call for left subtree
        postorderTraverse(root.right);  // call for right subtree
        System.out.println(root.val);   // print the value
    }
    public void Inorder(Node root)
    {
        if(root==null) {                // corner case
            return;
        }
        Stack <Node> st=new Stack<>();  // stack to main all the element
            st.push(root);              // push root in stack
            while(!st.isEmpty()){       // iterate until stack not empty
                Node temp=st.peek();    // keep peek element in the temp
                if(temp.left !=null){
                    st.push(temp.left); // if temp.left not null then stack push temp.left
                    temp.left=null;     // null the temp.left because it will not stop after poping the element in below lines
                }
                else {                  // if temp.left is null
                    st.pop();           // pop top element
                    System.out.println(temp.val);  //print the value

                    if (temp.right != null) {   //if right present then store in stack
                        st.push(temp.right);
                    }
                }
            }
    }
    public void preorder(Node root)
    {
        if(root==null) {
            return;
        }
        Stack <Node> st=new Stack<>();
        st.push(root);                    //push root in stack
        while(!st.isEmpty()){             //iterate until stack is not empty

            Node temp=st.peek();          //new node point stack peek element
            System.out.println(temp.val); //print temp.val;
            st.pop();                     //pop the element
            if(temp.right !=null) {       //right subtree first
                st.push(temp.right);      //temp right push
            }
            if (temp.left != null) {      //left subtree first
                st.push(temp.left);       //temp left push
            }

        }

    }
    public void oneStackpostorder(Node root)
    {
        if(root==null) {
            return;
        }
        Stack <Node> st=new Stack<>();
        Node curr=root;
        while(!st.isEmpty()||curr!=null){
          if(curr!=null){
              st.push(curr);
              curr=curr.left;
          }
          else{
              Node temp=st.peek().right;
              if(temp==null){
                  temp=st.pop();
                  System.out.println(temp.val);
                  while(!st.isEmpty()&& temp==st.peek().right){
                      temp=st.peek();
                      System.out.println(st.pop().val);
                  }
              }
              else{
                  curr=temp;
              }
          }
        }
    }
    public static void twoStackPost(Node root){
        if(root==null){
            return;
        }
        Stack <Node> stack=new Stack<>();               //first stack
        Stack <Integer> support=new Stack<>();          //second stack is for support first stack
        stack.push(root);                               //push root in stack
        while(!stack.isEmpty()){                        //iterate until stack is not empty
            Node temp=stack.peek();                     //first stack peek
            support.push(stack.pop().val);              //pop the stack first top value and push in second stack
            if(temp.left!=null)stack.push(temp.left);   //insert temp left element
            if(temp.right!=null)stack.push(temp.right); //insert temp right element
        }
        while(!support.isEmpty()){                      //support stack and print it `
            System.out.println(support.pop());
        }
    }
}
