public class Island {

	public void DFS(char [][]grid,int i,int j ) {
		
		if(i<0 || j<0 || i==grid.length || j==grid[i].length) {
			return;
		}
		if(grid[i][j]=='0')return;
		grid[i][j]='0';
		DFS(grid,i,j+1);
		DFS(grid,i,j-1);
		DFS(grid,i+1,j);
		DFS(grid,i-1,j);

	}

	public int numIslands(char [][] grid) {
		if (grid.length == 0 || grid == null) return 0;
		int count=0;
		for (int i=0;i<grid.length;i++) {
			for (int j=0;j<grid[i].length;j++) {
				if(grid[i][j]=='1' ) {
					count++;
					DFS(grid,i,j);

				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		char [][]matrix= {{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'}
		};
		Island is=new Island();
		System.out.print(is.numIslands(matrix));

	}

}
