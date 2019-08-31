public class Island {

	public void DFS(int [][]graph,boolean [][]visited,int i,int j ) {
		if(i<0 || j<0 || i==graph.length || j==graph[i].length|| visited[i][j]) {
			return;
		}
		if(graph[i][j]==0)return;
		visited[i][j]=true;
		DFS(graph,visited,i,j+1);
		DFS(graph,visited,i,j-1);
		DFS(graph,visited,i+1,j);
		DFS(graph,visited,i-1,j);

	}

	public int noofislands(int [][] graph) {
		if (graph.length == 0 || graph == null) return 0;
		int count=0;
		boolean [][]visited=new boolean [graph.length][graph[0].length];
		for (int i=0;i<graph.length;i++) {
			for (int j=0;j<graph[i].length;j++) {
				if(graph[i][j]==1 && !visited[i][j]) {
					count++;
					DFS(graph,visited,i,j);

				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int [][]matrix= {{1,1,1,1,0},
				{1,1,0,1,0},
				{1,1,0,0,0},
				{0,0,0,0,0}
		};
		Island is=new Island();
		System.out.print(is.noofislands(matrix));

	}

}
