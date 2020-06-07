
// Check whether the tree is BST or not

class Binary_tree{

// Array to insert elements in array in increasing order
static int a[]=new int[100];
static int i=0;
  
  public static void main(String[] args)
  {
    Node root;
      root=new Node(10);
      root.l=new Node(8);
      root.r=new Node(12);
      root.l.l=new Node(7);
      root.l.r=new Node(11);

      
      System.out.println();
      System.out.println("InOrder");
      InOrder(root);
      
      System.out.println(check()); 
  }


// Function to check whether the array is in ascending order or not:
  static boolean check(){
    for(int j=0;j<i-1;j++){
        if(a[j+1]>a[j]) continue;
        else return false;
      }
      return true;
  }

  

// Putting values in array in inorder method. 
  static void InOrder(Node curr){
    
    if(curr==null) return;
    
    InOrder(curr.l);
    a[i++]=curr.data;
    InOrder(curr.r);
    
    
  }

}

// Node implemenataion
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
