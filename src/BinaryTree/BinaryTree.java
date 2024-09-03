package BinaryTree;
 // implement a binary tree and its basics

public class BinaryTree {
    public static void Display(Node root){   //this function is used to display tree values
        if(root==null){   //check root is null or not
            return;
        }
        System.out.println(root.val);  //return root value
        if(root.left!=null) {
            System.out.println(root.left.val); //print left node value if present
        }
        if(root.right!=null) {
            System.out.println(root.right.val);  //print right node value if present
        }
        Display(root.left);
        Display(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(10);  //this is our root node
        Node left =new Node(20);  //this is left node for root
        Node right=new Node(30);  //this is right node for root
        root.left=left;
        root.right=right;
        Node Left_left =new Node(90); //same goes here
        Node Left_right=new Node(50);
        left.left=Left_left;
        left.right=Left_right;
        Node Right_left =new Node(80);
        Node Right_right=new Node(40);
        right.left=Right_left;
        right.right=Right_right;
//        Display(root);
//        System.out.println();
        //Traversal.InTraverse(root);
        System.out.println();
        Traversal p=new Traversal();
        p.oneStackpostorder(root);
        System.out.println();

    }
}
