
import java.io.*; 
import java.util.*; 
import java.lang.*; 

class Main
{ 

	public static void main(String[] args) 
{ 
	Node root = new Node(1); 
	root.left = new Node(2); 
	root.right = new Node(3); 
	root.left.left = new Node(4); 
	root.left.right = new Node(5); 
	root.left.right.right = new Node(15); 
	root.right.left = new Node(6); 
	root.right.right = new Node(7); 
	root.right.left.right = new Node(8); 

	Node x = new Node(43); 

	printCousins(root, x); 
	printCousins(root, root); 
	printCousins(root, root.right); 
	printCousins(root, root.left); 
	printCousins(root, root.left.left); 
} 
	
// Function to find the cousins of the node 
static void printCousins(Node root, 
						Node node_to_find) 
{ 

	if (root == node_to_find) 
	{ 
		System.out.print("Cousin Nodes :" + 
						" None" + "\n"); 
		return; 
	} 

	Queue<Node> q = new LinkedList<Node>(); 
	boolean f = false; 
	int s = 0;  
	q.add(root); 

	while (q.isEmpty() == false && 
				f == false) 
	{ 

		s = q.size(); 
		while (s-- > 0) 
		{ 
			root = q.peek(); 
			q.remove(); 


			if ((root.left == node_to_find || 
				root.right == node_to_find)) 
			{ 
				f = true; 
			} 
			else
			{ 
				if (root.left != null) 
					q.add(root.left); 
				if (root.right!= null) 
					q.add(root.right); 
			} 

		} 
	} 

	
	if (f == true) 
	{ 
		System.out.print("Cousin Nodes : "); 
		s = q.size(); 

		if (s == 0) 
			System.out.print("None"); 
		
		for (int i = 0; i < s; i++) 
		{ 
			root = q.peek(); 
			q.poll(); 
			
			System.out.print(root.data + " "); 
		} 
	} 
	else
	{ 
		System.out.print("Node not found"); 
	} 
	
	System.out.println(""); 
	return; 
} 

 

} 
// Declaration of Node
class Node 
{ 
	int data; 
	Node left, right; 
	Node(int key) 
	{ 
		data = key; 
		left = right = null; 
	} 
} 
