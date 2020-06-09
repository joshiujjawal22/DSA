/*
* 
*  Floyd detection method to find the point where the linked list begins;
*   
*
*/

class Main
{

    public static void main(String[] args) {
        
        Node node =new Node(20);
        node.next=new Node(4);
        node.next.next=new Node(15);
        node.next.next.next=new Node(10);
        
        // Loop
        node.next.next.next.next = node;
        
        Node point=detectCycle(node);
       if(point==null) System.out.println("No loop Exists");
       else System.out.println(point.data);
    }
    
    // Function to find the beginning point of cycle

      static Node detectCycle(Node head) {
          
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break; 
        }
        // Check whether the loop exist or not 
        if(fast==null || fast.next==null) return null;
        
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
}
}

// Node definition
class Node{
    int data;
    Node next;
    Node(){
        next = null;
    }
    Node(int d){
        data = d;
        next = null;
    }
    Node(int d, Node n){
        data = d;
        next = n;
    }
}