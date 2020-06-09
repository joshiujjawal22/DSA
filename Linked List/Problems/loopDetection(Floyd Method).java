/*
* 
*  Floyd detection method to find whether the linked list contains a loop or not  
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
        
        if(hasCycle(node)) System.out.println("Loop found");
        else System.out.println("Linked doesn't contain loop");
    }
    
    // Function to find the loop
     static boolean hasCycle(Node head) {
        if(head==null || head.next==null) return false;
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
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