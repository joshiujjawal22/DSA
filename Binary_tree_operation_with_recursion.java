class Binary_tree{
	public static void main(String[] args)
	{
		Node root;
			root=new Node(1);
			root.l=new Node(2);
			root.r=new Node(3);
			root.l.l=new Node(4);
			root.l.r=new Node(5);
			root.l.l.l=new Node(6);
			root.l.l.r=new Node(7);
			root.l.r.l=new Node(8);
			root.l.r.r=new Node(9);
			System.out.println("PreOrder");
			PreOrder(root);
			System.out.println();
			System.out.println("InOrder");
			InOrder(root);
			System.out.println();
			System.out.println("PostOrder");
			PostOrder(root);
		
	}

	static void PreOrder(Node curr){
		if(curr==null) return;
		System.out.print(curr.data+" ");
		PreOrder(curr.l);
		PreOrder(curr.r);
	}

	static void InOrder(Node curr){
		if(curr==null) return;
		InOrder(curr.l);
		System.out.print(curr.data+" ");
		InOrder(curr.r);
	}

	static void PostOrder(Node curr){
		if(curr==null) return;
		PostOrder(curr.l);
		PostOrder(curr.r);
		System.out.print(curr.data+" ");
	}


}


class Node{
	int data;
	Node l,r;
	Node(){}
	Node(int d)
	{
		data=d;
		l=null;
		r=null;
	}
}
