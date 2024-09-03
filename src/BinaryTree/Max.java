package BinaryTree;

public class Max {
    public static int Max(Node root){
        if(root==null){
            return 0;
        }
        int roo=root.val;
        int l=Max(root.left); //calling left subtree
        int r=Max(root.right);//calling right subtree
        return Math.max(roo,Math.max(l,r));//compare first with left and right subtree max then root node
    }
}
