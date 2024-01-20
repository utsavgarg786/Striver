package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland {

	public static void main(String[] args) {

		int[][] grid = {{0,1,1,0},{0,1,1,0},{0,0,1,0},{0,0,0,0},{1,1,0,1}};
		int ans = numberOfIslands(grid);
		System.out.println(ans);
	}

	private static int numberOfIslands(int[][] grid) {

		int m = grid.length;
		int n = grid[0].length;
		int[][] visited = new int[m][n];
		int count = 0;
		
		for(int row = 0; row< m; row++) {
			for(int col = 0 ; col<n; col++) {
				if(visited[row][col] == 0 && grid[row][col] == 1) {
					bfs(row, col, visited, grid, m, n);
					count++;
				}
			}
		}
		return count;
	}

	private static void bfs(int row, int col, int[][] visited, int[][] grid, int m, int n) {

		visited[row][col] = 1;
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(row, col));
		
		while(!queue.isEmpty()) {
			int a = queue.peek().first;
			int b = queue.peek().second;
			queue.remove();
			
			for(int deltaRow = -1; deltaRow <=1; deltaRow++) {
				for(int deltaCol = -1; deltaCol <=1; deltaCol++) {
					int nRow = deltaRow + a;
					int nCol = deltaCol + b;
					if(nRow >=0 && nRow< m && nCol >= 0 && nCol < n && visited[nRow][nCol] == 0 && grid[nRow][nCol] == 1) {
						visited[nRow][nCol] = 1;
						queue.add(new Pair(nRow, nCol));
					}
				}
			}
		}
 	}

}

class Pair{
	int first;
	int second;
	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
}
