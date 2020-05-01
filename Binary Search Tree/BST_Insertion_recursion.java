class BST_insert_rec{

	public static void main(String[] args){
		Node root=null;
		root=insert_rec(20,root);
		insert_rec(10,root);
		insert_rec(30,root);
		insert_rec(50,root);
		insert_rec(40,root);
		insert_rec(60,root);

		inorder(root);
	}

	

		static Node insert_rec(int key , Node root) { 
  
        
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
	static void inorder(Node root){
		if(root==null) return;
		inorder(root.l);
		System.out.println(root.data);
		inorder(root.r);
	}
}

class Node{
	int data;
	Node l,r;
	Node(){}
	Node(int d){
		data=d;
		l=r=null;
	}
}

