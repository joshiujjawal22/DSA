// Check whether the tree is BST or not

class Binary_tree{


static int max=Integer.MIN_VALUE;
  
  public static void main(String[] args)
  {
    Node root;
      root=new Node(10);
      root.l=new Node(8);
      root.r=new Node(12);
      root.l.l=new Node(7);
      root.l.r=new Node(11);      
      
      System.out.println(checkValuesInorderly(root)); 
  }

  

  
// Check the values in incresing order or not while traversing inorderly
  static boolean checkValuesInorderly(Node curr){
    
    if(curr==null) return true;
    
    checkValuesInorderly(curr.l);
    if(max>curr.data) return false;
    else max=curr.data;
    checkValuesInorderly(curr.r);
    return true;
    
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
