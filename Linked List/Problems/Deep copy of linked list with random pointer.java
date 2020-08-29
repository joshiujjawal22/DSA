import java.util.*;

/*
* Program to make a copy of linked list
* with it's random pointer.
* Note: Random pointer of copied linked list 
* must point the same value as in original linked 
* list.
*
* Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
  Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
*
* Complexity:O(n)
*/ 


class Linked_list_with_random_pointer{

	public static void main(String[] args) {
		Node root;
		
		// Creating a linked list
		root=new Node(7);
		root.next=new Node(13);
		root.next.next=new Node(11);
		root.next.next.next=new Node(10);
		root.next.next.next.next=new Node(1);

		// Linking of random pointer
		root.random=null;
		root.next.random=root;
		root.next.next.random=root.next.next.next.next;
		root.next.next.next.random=root.next.next;
		root.next.next.next.next.random=root;

		Node res=copyRandomList(root); //Result

		// Traversing to print the value.
		while(res!=null) {

			System.out.print("Value : "+res.val +" ");

			if(res.random==null) System.out.println("Random : null");
			else System.out.println("Random : "+res.random.val);

			res=res.next;
		}
	}

	// Function to make copy of linked list
	static Node copyRandomList(Node head) {

        if(head==null || head.next==null) return head;

        Node head1=null,cur=null,cur1=head,cur2=head.next;

        while(cur1!=null){

            Node n=new Node(cur1.val);
            if(cur==null){
                cur=n;
                head1=cur;
            }

            else{
                cur.next=n;
                cur=cur.next;
            }

            
            cur1.next=cur;
            cur.random=cur1;
            cur1=cur2;

            if(cur2!=null){
                cur2=cur2.next;
            }
        }
			

        cur=head1;
        while(cur!=null){
        	if(cur.random.random==null) cur.random=null;
        	else cur.random=cur.random.random.next;
            cur=cur.next;
        }
        return head1;
}
}

// Node implemenataion
class Node{
int val;
Node next,random;
	Node(){}
	Node(int d){
	val=d;
	next=null;
	random=null;
	}
}