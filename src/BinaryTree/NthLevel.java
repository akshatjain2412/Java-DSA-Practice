package BinaryTree;

public class NthLevel {
    public static void nthLevelelemnt(Node root,int n)
            //here n is the level of the tree
    {
        if(root==null){
            return;
        }
        if(n==1){
            System.out.println(root.val);
            return;
        }
        nthLevelelemnt(root.left,n-1);
        nthLevelelemnt(root.right,n-1);
    }
}
