import java.util.*;

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


class Main{
	
	public static void main(String args[]){
		
		Node root;
			
			// Putting values
			root=new Node(1);
			root.l=new Node(2);
			root.r=new Node(3);
			root.l.l=new Node(4);
			root.l.r=new Node(5);

			// Objects of Main to use below function
			Main or=new Main();
			System.out.println("INORDER");
			or.inorder(root);
			System.out.println("PREORDER");
			or.preorder(root);
			System.out.println("POSTORDER");
			or.PostOrder(root);
			
		
	}
	       // For Inorder
                void inorder(Node curr){
			Stack<Node> s=new Stack<Node>();
			while(!s.isEmpty() || curr!=null)
			{
			while(curr!=null)
			{ 		s.push(curr);
					curr=curr.l;
						}
						curr=s.pop();
						System.out.println(curr.data);
						curr=curr.r;
			}
            }
            
            // For preorder
            
                void preorder(Node curr){
                    Stack<Node> s=new Stack<Node>();
                    while(!s.isEmpty() || curr!=null)
			{
			while(curr!=null)
			{ 	System.out.println(curr.data);	
			    s.push(curr);
					curr=curr.l;
						}
						curr=s.pop();
						curr=curr.r;
			}
                }
                
                
        // For PostOrder
        
        void PostOrder(Node curr){
            Stack<Node> s1=new Stack<Node>();
            Stack<Node> s2=new Stack<Node>();
            s1.push(curr);
        
        while(!s1.isEmpty())
        {   Node temp=s1.pop();
            s2.push(temp);
            if(temp.l!=null) s1.push(temp.l);
            if(temp.r!=null) s1.push(temp.r);
        } 
        while(!s2.isEmpty()) System.out.println(s2.pop().data);

        	// Implementation of post order using single stack

        	// Stack <Node>s=new Stack<Node>();
        	// while(curr!=null || !s.isEmpty())
        	// {
        	// 	if(curr!=null){
        	// 		s.push(curr);
        	// 		curr=curr.left;
        	// 	}
        	// 	else
        	// 	{
        	// 		Node temp=s.peek();
        	// 		if(temp.right==null)
        	// 		{
        	// 			print(temp.data);
        	// 			s.pop();
        	// 		}
        	// 		while(!s.isEmpty() && temp==s.peek().right);
        	// 		{
        	// 			temp=stk.poll();
        	// 			System.out.println(temp.data);
        	// 		}
        	// 	}
        	// }
 }

}
