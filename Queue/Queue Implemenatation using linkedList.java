/*
* 
*   Oueue Implementation using linked list
*   Made IsEmpty , push and pop function
*   
*
*/



class LinkedList
{
    

    public static void main(String[] args) {
        
        queue q=new queue();
        q.isEmpty();
        q.push(5);
        q.push(6);
        System.out.println((q.pop()));
        System.out.println((q.pop()));


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
class queue{
    Node rear,front;
    {
        rear=null;
        front=null;
    }

boolean isEmpty()
{
    if(rear==null && front==null) return true;
    return false;
}
void push(int val){
    Node nn=new Node(val);
    if(nn==null) return;
    if(front==null) front=rear=nn;
    else
    {
        rear.next=nn;
        rear=rear.next;
    }
}
int pop(){
    if (front == null) 
            return 0; 
  
        
        Node temp = front; 
        front = front.next; 
  
        if (front == null) 
            rear = null;
        return temp.data; 
}

}


