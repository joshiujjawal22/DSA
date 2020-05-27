import java.util.*; 
  

    class Graph 
    { 
        int V;   
        LinkedList<Integer>[] adj; 
          
         
        Graph(int V) 
        { 
            this.V = V; 
            adj = new LinkedList[V]; 
              
            for (int i = 0; i < adj.length; i++) 
                adj[i] = new LinkedList(); 
              
        } 
          
        
        void addEdge(int v, int w) 
        { 
            adj[v].add(w); 
        } 
          
         
        void DFS(int s) 
        { 
             
            boolean visited[] = new boolean[V]; 
            Stack<Integer> stack = new Stack<>(); 
               
            stack.push(s); 
              
            while(stack.empty() == false) 
            { 
               
                s = stack.peek(); 
                stack.pop(); 
                  
                
                if(!visited[s]) 
                { 
                    System.out.print(s + " "); 
                    visited[s] =true; 
                } 
                  
                 
                Iterator<Integer> itr = adj[s].iterator(); 
                  
                while (itr.hasNext())  
                { 
                    int v = itr.next(); 
                    if(!visited[v]) 
                        stack.push(v); 
                } 
                  
            } 
        } 
     
      
     
    public static void main(String[] args)  
    { 
        
        Graph g = new Graph(5); 
          
        g.addEdge(1, 0); 
        g.addEdge(0, 2); 
        g.addEdge(2, 1); 
        g.addEdge(0, 3); 
        g.addEdge(1, 4); 
              
        System.out.println("Following is the Depth First Traversal"); 
        g.DFS(0); 
    } 
} 