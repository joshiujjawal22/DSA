import java.util.*;

/*
* Program to check kth smallest
* element in BST.
*
* Input:[3,1,4,null,2], k = 1
  Output:1

* Input:[12,8,15,null,9], k = 2
  Output:9
*/

class Binary_tree{
  
    // Driver Code
    public static void main(String[] args){
      
        // Binary Tree
        Node root;
        root=new Node(12);
        root.l=new Node(8);
        root.r=new Node(15);
        root.l.r=new Node(11);  

        int k=1; //Kth value

        int result=Smallest_element(root,k);

        System.out.println("Smallest "+k+"th element is: "+result); 
    }

    // Function to find smnallest kth element.
    static int Smallest_element(Node root,int k){

        Stack<Node> s=new Stack<Node>();

        while(!s.isEmpty() || root!=null){

            while(root!=null){
                s.push(root);
                root=root.l;
            }
            root=s.pop();
            k--;
            if(k==0) return root.data;
            root=root.r;    
        }
        return 0;
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

  
