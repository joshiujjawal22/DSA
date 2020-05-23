
/*
* 
*   Linked List Implementation
*   Made insertAtFirst , insertAtLast,deleteAtLast,deleteAtFirst,display functions
*   
*
*/

class LinkedList
{
    

    public static void main(String[] args) {
        Node head = null;
        head = insert_At_First(6, head);
        head = insert_At_First(4, head); 
        insert_At_Last(8, head);
        display(head);
        deleteLastNode(head);
        head = deleteFirstNode(head);
        display(head);
}
    

    public static Node insert_At_First(int data, Node head)
    {
        Node node = new Node(data);
        node.next = head;
        return node;
    }

    public static Node insert_At_Last(int data, Node head)
     {
        Node node = new Node(data);
        if(head == null)
        {
            return node;
        }
        
        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = node;
        return head;                
    }

    public static Node deleteLastNode(Node head)
    {
        Node curr = head;
        Node node;
        if(head == null)
        {
            return null;
        }
        else if(head.next == null)
        {
            node = head;
            head = null;
            return null;
        }
        
        while(curr.next !=null && curr.next.next != null)
        {
            curr = curr.next;
        }
        node = curr.next;
        curr.next = null;
        
        return node;
    }

    public static Node deleteFirstNode(Node head)
    {
        
        if(head == null)
        {
            return null;
        }
        head=head.next;        
        return head;
        
    }



    public static void display(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}


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



