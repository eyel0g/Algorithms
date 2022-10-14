import java.util.*;
public class Test {
	public static void main(String args[]) {
		
	    Scanner sc = new Scanner(System.in);
	    Graph d = new Graph(7);
	    int V = 7;
	 
		Prims.Graph_p p_graph = new Prims.Graph_p(V);
		Prims u = new Prims();
		
       //edges of directed graph 
        d.addEdge(0, 1);
        d.addEdge(1, 2);
        d.addEdge(1, 5);
        d.addEdge(2, 0);
        d.addEdge(2, 3);
        d.addEdge(3, 4);
        d.addEdge(4, 0);
        d.addEdge(4, 6);
        d.addEdge(5, 6);
        
        //edges and their weights of undirected graph
        u.addEdge(p_graph, 0, 1, 3);
        u.addEdge(p_graph, 1, 2, 2);
        u.addEdge(p_graph, 1, 5, 2);
        u.addEdge(p_graph, 2, 0, 8);
        u.addEdge(p_graph, 2, 3, 5);
        u.addEdge(p_graph, 3, 4, 1);
        u.addEdge(p_graph, 4, 0, 4);
        u.addEdge(p_graph, 4, 6, 3);
        u.addEdge(p_graph, 5, 6, 9);
     
      
        	System.out.print("Enter the starting vertex for DFS: ");
        	//System.out.println("Following is Depth First Traversal "+ "(starting from vertex 2)");
        	int vertex = sc.nextInt(); 
        	
        	System.out.println("\n------------------------------------ ");
        	
        	System.out.println("\nDFS starting from vertex " + vertex +":");
            d.DFS(vertex);
         
            System.out.println("\n------------------------------------ ");
            
            System.out.println("\nPrim's Implementation: ");
            u.prims_mst(p_graph);

            System.out.println("\nCost"+ ":"+Prims.cost);
            
            
            System.out.println("\n------------------------------------ ");
            
		   if(d.isCyclic())
			System.out.println("Graph contains cycle");
		   else
			System.out.println("Graph doesn't contain cycle");
        
        
        
    }
    
}
	