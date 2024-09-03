package BinaryTree;

public class Height {
    public static int height(Node root){
        if(root==null){  //base condition
            return 0;
        }
        if(root.left==null&&root.right==null){   //this is the use to terminate extra calls
            return 0;
        }
        int l=height(root.left);  //calling left subtree
        int r=height(root.right);  //calling right subtree
        return 1+Math.max(l,r);    //root + left or right which is big here
    }
}
