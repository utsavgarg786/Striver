package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	public static void main(String[] args) {

		int[][] grid = {{0,1,2},{0,1,1},{2,1,1}};
		int ans = rottenOranges(grid);
		System.out.println(ans);
	}

	private static int rottenOranges(int[][] grid) {

		int m = grid.length;
		int n = grid[0].length;
		Queue<Rotten> queue = new LinkedList<>();
		int[][] visited = new int[m][n];
		
		for(int i = 0 ; i< m ; i++) {
			for(int j = 0 ; j< n ; j++) {
				if(grid[i][j] == 2) {
					queue.add(new Rotten(i, j, 0));
					visited[i][j] = 2;
				}else {
					visited[i][j] = 0;
				}
			}
		}
		int maxTime = 0;
		int[] deltaRow = {-1,0,1,0};
		int[] deltaCol = {0,1,0,-1};
		
		while(!queue.isEmpty()) {
			int row = queue.peek().row;
			int col = queue.peek().col;
			int time = queue.peek().time;
			maxTime = Math.max(maxTime, time);
			queue.remove();
			for(int i = 0 ; i< 4; i++) {
				int nRow = row + deltaRow[i];
				int nCol = col + deltaCol[i];
				if(nRow >= 0 && nRow < m && nCol >= 0 && nCol < n && visited[nRow][nCol] == 0 && grid[nRow][nCol] == 1) {
					queue.add(new Rotten(nRow, nCol, time+1));
					visited[nRow][nCol] = 2;
				}
			}
		}
		for(int i = 0 ; i< m ; i++) {
			for(int j = 0; j< n; j++) {
				if(visited[i][j] != 2 && grid[i][j] == 1) {
					return -1;
				}
			}
		}
		return maxTime;
	}

}

class Rotten{
	int row; 
	int col;
	int time;
	public Rotten(int row, int col, int time) {
		this.row = row;
		this.col = col;
		this.time = time;
	}
}