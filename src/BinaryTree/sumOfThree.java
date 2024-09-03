package BinaryTree;

public class sumOfThree {
    public static int SumOfThree(Node root){  //sum of all the nodes
        if(root==null){
            return 0;
        }
        return root.val+SumOfThree(root.left)+SumOfThree(root.right);  //root.val+left subtree value+right subtree value
    }
}
