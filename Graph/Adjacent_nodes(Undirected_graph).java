import java.util.*;

 
  
class Undirected_Graph { 

     static int len=6;
     static ArrayList<ArrayList<Integer> > adjacent  = new ArrayList<ArrayList<Integer> >(len); 
   
    static void toaddEdge(int u, int v) 
    { 
        adjacent.get(u).add(v); 
        adjacent.get(v).add(u); 
    } 
  
    
    static void print(ArrayList<ArrayList<Integer> > adjacent) 
    { 
        for (int i = 0; i < adjacent.size(); i++) { 
            System.out.println("\nAdjacency list of vertex " + i); 
            for (int j = 0; j < adjacent.get(i).size(); j++) { 
                System.out.println(" -> "+adjacent.get(i).get(j) + " edge("+ i+ "," + adjacent.get(i).get(j) + ")" ); 
            }  
        } 
    } 
  
     
    public static void main(String[] args) 
    { 
        
          
        for (int i = 0; i < len ; i++) 
            adjacent.add(new ArrayList<Integer>()); 
  
        
        toaddEdge(0, 1); 
        toaddEdge(0, 3); 
        toaddEdge(1, 2); 
        toaddEdge(1, 4); 
        toaddEdge(1, 5); 
        toaddEdge(2, 3); 
        toaddEdge(3, 2);
        toaddEdge(4, 5); 

          
        print(adjacent); 
    } 
} 