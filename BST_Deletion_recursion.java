import java.util.*;


class main{
		public static void main(String[] args) {
		tree t=new tree();
		Node root=null;
		// ------Insertion------------
		root=t.insert_rec(50,root);
		t.insert_rec(30,root);
		t.insert_rec(20,root);
		t.insert_rec(40,root);
		t.insert_rec(70,root);
		t.insert_rec(60,root);
		t.insert_rec(80,root);
		// ---------End----------

		// ------Deletion------------
		
	
		t.delete_rec(20,root);
		t.delete_rec(30,root);
		t.delete_rec(50,root);
		// ------End------------

		// To print in inorder
		t.inorder(root);
	}
}



class tree{

// Insertion using Recursion:
Node insert_rec(int key , Node root) { 
  
        
        if (root == null) { 
            root = new Node(key); 
            return root; 
        }
  
        if (key < root.data) 
            root.l = insert_rec(key,root.l); 
        else if (key > root.data) 
            root.r = insert_rec(key,root.r); 

        return root; //Always remain constant
    }

// Deletion using recursion

    Node delete_rec(int key , Node root)

    { 
       
        if (root == null)  return root; 
  
        
        if (key < root.data) 
            root.l = delete_rec(key , root.l); 
        else if (key > root.data) 
            root.r = delete_rec(key , root.r); 
  
        // if key is found
        else
        { 
            // if node has 0 or 1 child only
            if (root.l == null) 
                return root.r; 
            else if (root.r == null) 
                return root.l; 
  
            // if node has 2 child
            root.data = min(root.r); 
            // delete min value prev position
            root.r = delete_rec(root.data , root.r); 
        } 
  
        return root; 
    } 
  
  		// To find minimum value if node contains 2 child.
    int min(Node root) 
    { 
        int m_v = root.data; 
        while (root.l != null) 
        { 
            m_v = root.l.data; 
            root = root.l; 
        } 
        return m_v; 
    }

    void inorder(Node root){
    	if(root==null) return;
    	inorder(root.l);
    	System.out.println(root.data);
    	inorder(root.r);
    } 
	 
}

// Binary tree
class Node {
	int data;
	Node l,r;
	Node(){}
	Node(int d){
		data=d;
		l=r=null;
	}
}


 


