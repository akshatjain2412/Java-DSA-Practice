package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfbinaryTree {
    public static int Size(Node root){
        if(root==null){
            return 0;
        }
        return 1+Size(root.left)+Size(root.right); //root + leftSubtree+right subtree
    }
}
