import java.util.*;

/*
* Minimum Distance between
* BST nodes.
*
* Input:[3,1,4,null,2]
  Output:1

* Input:[27,15,33,null,19]
  Output:4
*/

class Binary_tree{

    private static Integer previous = null;
    private static int min = Integer.MAX_VALUE;
  
    // Driver Code
    public static void main(String[] args){
      
        // Binary Tree
        Node root;
        root=new Node(27);
        root.l=new Node(15);
        root.r=new Node(33);
        root.l.r=new Node(19);  

        int result=minDiffInBST(root);

        System.out.println("Minimum distance between BST nodes is :"+result); 
    }

    // To find minimum
    static int minDiffInBST(Node root) {
        
        inOrder(root);
        return min;
    }
        
    // Inorder tarversal to check in
    // increasing order
    static void inOrder(Node node){
     
    if(node == null) return;
     
    inOrder(node.l);
      
    if(previous != null){
        if(min > node.data - previous){
            min = node.data - previous;
        }
    }                      
    previous = node.data;
     
    inOrder(node.r);
    }
}  

// Node implemenataion
class Node{

    int data;
    Node l,r;
    Node(){}
    Node(int d){
        data=d;
        l=null;
        r=null;
    }
}  