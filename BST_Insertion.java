import java.util.*;


class BST_insert{

	public static void main(String[] args){
		Node root=null;
		root=insert(20,root);
		insert(10,root);
		insert(30,root);
		insert(50,root);
		insert(40,root);
		insert(60,root);

		inorder(root);
	}

	static Node insert(int key,Node root){

		Node nn=new Node(key);

		Node prev=null;
		
		while(root!=null){
			prev=root;
			if(root.data>key){
				root=root.l;}
			else{
				root=root.r;
			}
		}

		if(prev==null){
			return nn;
		}
		else if(prev.data>key) prev.l=nn;
		else prev.r=nn;

		return prev;
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




