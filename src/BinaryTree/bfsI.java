package BinaryTree;

import BinaryTree.Node;

import java.util.LinkedList;
import java.util.Queue;
  //iterative Method
public class bfsI {
    public void bfsIterative(Node root) {   //this is the method for bfs by iterative
        if (root == null) return;           //if corner condition
        Queue<Node> q = new LinkedList<>();
        q.add(root);                        //add root in queue
        while (!q.isEmpty()) {
            Node temp = q.element();        //take peek element
            if (temp.left != null) {
                q.add(temp.left);           //add left element
            }
            if (temp.right != null) {
                q.add(temp.right);          //add right element
            }
            System.out.println(temp.val);   //print value of selected element
            q.remove();  //then remove it
        }
    }
    //recursive method
    public static void Bfs(Node root,int n)     //this is the recursive method
    {                                           //we use int n for because we want
        if(root==null){
            return;
        }
        if(n==1){                //this is only for 1 root node
            System.out.println(root.val);
        }
        if(root.left!=null) {
            System.out.println(root.left.val);
        }
        if (root.right!=null){
            System.out.println(root.right.val);
        }

        Bfs(root.left,n-1);  //call for left subtree
        Bfs(root.right,n-1); //call for right subtree
    }
}


