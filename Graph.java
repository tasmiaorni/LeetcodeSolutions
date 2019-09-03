import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	// no of vertices
	private int V;
	//array of linkedlist 
	private LinkedList<Integer> adjacencylist[];

	//constructor
	Graph(int v ){
		this.V=v;
		adjacencylist=new LinkedList[v];
		for (int i=0;i<v;i++) {
			adjacencylist[i]=new LinkedList<Integer>();
		}
	}

	void addEdge(int v,int w) {
		adjacencylist[v].add(w);

	}

	// BFS traversal
	void BFS(int start_node) {

		boolean visited[]= new boolean[V];
		LinkedList<Integer> all_nodes=new LinkedList<Integer>();
		visited[start_node]=true;
		all_nodes.add(start_node);
		while(all_nodes.size()!=0) {
			int current_node=all_nodes.poll();
			System.out.print(current_node);
			Iterator<Integer> child_list= adjacencylist[current_node].listIterator();
			while(child_list.hasNext()) {
				int child=child_list.next();
				if(!visited[child]) {
					visited[child]=true;
					all_nodes.add(child);					
				}			
			}			
		}	

	}

	// DFS with recursion

	void DFSUtil(int v,boolean visited[]) {
		visited[v]=true;
		System.out.print(v);
		Iterator<Integer> in=adjacencylist[v].listIterator();
		while(in.hasNext()) {
			int child=in.next();
			if (!visited[child]) {
				DFSUtil(child,visited);
			}
			System.out.print("\n");
		}
		
	}
	void DFS(int start) {
		// initially mark all the vertices as not visited(false)
		boolean visited[]=new boolean[V];
		DFSUtil(start,visited);		
	}
	
	// this one uses DFS to find connected components in a graph
	void connectedcomponentDFS() {
		//initially mark every node in the graph as unvisited
		boolean visited[]=new boolean[V];
		int component=0;
		//take each node and check whether it's visited or not
		// if it's not visited then call DFSUtil and pass the adjacency list of that node
		for (int i=0;i<V;i++) {
			if(!visited[i]) {
				component++;
				DFSUtil(i,visited);
			}
		}
		System.out.print("Total Components using DFS:"+component+"\n");
	}

	// this one uses BFS to find connected component in a graph
	void connectedcomponentBFS() {
		//initially mark every node in the graph as unvisited
		boolean visited[]=new boolean[V];
		int component=0;
		LinkedList<Integer> queue=new LinkedList<Integer>();
		for (int s=0;s<V;s++) {
			if(!visited[s]) {
				queue.add(s);
				visited[s]=true;
				component++;
				while(!queue.isEmpty()) {
					int node=queue.poll();
					Iterator<Integer>in =adjacencylist[node].listIterator();
					while(in.hasNext()) {
						int child=in.next();
						visited[child]=true;
						queue.add(child);
					}
				}

			}
		}
		System.out.print(component+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph g=new Graph(5);
		g.addEdge(0, 1);  
		g.addEdge(2, 3);  
		g.addEdge(3, 4); 
		System.out.print("Connected components using BFS:\n");
		g.connectedcomponentBFS();
		System.out.print("Connected components using DFS:\n");
		g.connectedcomponentDFS();
		System.out.print("BFS Traversal:");
		g.BFS(2);
		System.out.print("\n");
		System.out.print("DFS Traversal:");
		g.DFS(2);

	}

}
