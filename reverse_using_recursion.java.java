class LinkedList { 
  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
   
    Node reverse(Node curr, Node p) 
    { 
  
        
        if (curr.next == null) { 
            head = curr; 
            curr.next = p; 
            return head; 
        } 
  
       
        Node next1 = curr.next; 
        curr.next = p; 
        reverse(next1, curr); 
        return head; 
    } 
  

    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        list.head = new Node(1); 
        list.head.next = new Node(2); 
        list.head.next.next = new Node(3); 
        list.head.next.next.next = new Node(4); 
         
  
         
        list.printList(head); 
        Node r = list.reverse(head, null); 
        System.out.println(""); 
        list.printList(r); 
    } 
} 