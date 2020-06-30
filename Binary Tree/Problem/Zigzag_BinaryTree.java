// Java implementation of a O(n) time  
// method for Zigzag order traversal 
import java.util.*; 

public class zigZagTreeTraversal { 
  
// driver program to test the above function 
public static void main(String[] args)  
{ 
    BinaryTree tree = new BinaryTree(); 
    tree.root = new Node(1); 
    tree.root.l = new Node(2); 
    tree.root.r = new Node(3); 
    tree.root.l.l = new Node(7); 
    tree.root.l.r = new Node(6); 
    tree.root.r.l = new Node(5); 
    tree.root.r.r = new Node(4); 
  
    System.out.println("ZigZag Order traversal of binary tree is"); 
    tree.printZigZagTraversal(); 
} 
}
  
// Binary Tree node 
class Node 
{ 
int data; 
Node l; 
Node r; 
Node(int data) 
{ 
    this.data = data;  
} 
} 
  
class BinaryTree { 
Node root; 
  
// function to print the 
// zigzag traversal 
void printZigZagTraversal() { 
      
    // if null then return 
    if (root == null) { 
    return; 
    } 
  
    // declare two stacks 
    Stack<Node> currentLevel = new Stack<>(); 
    Stack<Node> nextLevel = new Stack<>(); 
  
    // push the root 
    currentLevel.push(root); 
    boolean leftToRight = true; 
  
    // check if stack is empty 
    while (!currentLevel.isEmpty()) { 
  
    // pop out of stack 
    Node node = currentLevel.pop(); 
      
    // print the data in it 
    System.out.print(node.data + " "); 
  
    // store data according to current 
    // order. 
    if (leftToRight) { 
        if (node.l != null) { 
        nextLevel.push(node.l); 
        } 
          
        if (node.r != null) { 
        nextLevel.push(node.r); 
        } 
    } 
    else { 
        if (node.r != null) { 
        nextLevel.push(node.r); 
        } 
          
        if (node.l != null) { 
        nextLevel.push(node.l); 
        } 
    } 
  
    if (currentLevel.isEmpty()) { 
        leftToRight = !leftToRight; 
        Stack<Node> temp = currentLevel; 
        currentLevel = nextLevel; 
        nextLevel = temp; 
    } 
    } 
} 
} 
  
