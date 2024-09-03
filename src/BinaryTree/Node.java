package BinaryTree;

public class Node {
        int val;              //Node value
        Node left;            // left pointer
        Node right;           //right pointer

         Node(int val)  //Constructor     //default access modifier because we need only in binary tree class
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
}
