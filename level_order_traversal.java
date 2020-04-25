import java.util.*;


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


class Main{
	public static void main(String args[]){
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
			levelorder(root);

	}
		static void levelorder(Node head){
			Queue<Node> q=new LinkedList<Node>();
			while(head!=null)
			{
				System.out.println(head.data +" ");
				if(head.l!=null){
					q.add(head.l);
				}
				if(head.r!=null){
					q.add(head.r);
				}
				head=q.poll();
			}
		}
}