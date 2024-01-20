package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Practice {

	public static void main(String[] args) {
		int[][] grid = { {0, 1, 2}, {0, 1, 1}, {2, 1, 1}};
		int ans = minumumTime(grid);
		System.out.println(ans);
	}

	private static int minumumTime(int[][] grid) {
		
		int m = grid.length;
		int n = grid[0].length;
		int maxTime = 0;
		int[][] visited = new int[m][n];
		Queue<Pair1> queue = new LinkedList<Pair1>();
		
		for(int i = 0 ; i < m ; i++) {
			 for(int j = 0 ; j < n ; j++) {
				 if(grid[i][j] == 2) {
					 queue.add(new Pair1(i, j, 0));
					 visited[i][j] = 2;
				 }else {
					 visited[i][j] = 0;
				 }
			 }
		}
		
		while(!queue.isEmpty()) {
			int row = queue.peek().first;
			int col = queue.peek().second;
			int time = queue.peek().time;
			maxTime = Math.max(maxTime, time);
			queue.remove();
			int[] deltaRow = {-1,0,1,0};
			int[] deltaCol = {0,1,0,-1};
			
			for(int i = 0 ; i< 4; i++) {
				int nRow = deltaRow[i] + row;
				int nCol = deltaCol[i] + col;
				if(nRow >= 0 && nRow < m && nCol >= 0 && nCol < n 
						&& visited[nRow][nCol] == 0 && grid[nRow][nCol] == 1) {
					queue.add(new Pair1(nRow, nCol, time+1));
					visited[nRow][nCol] = 2;
				}
			}
		}
		for(int i = 0 ; i< m ; i++) {
			for(int j= 0 ; j< n ;j++) {
				if(visited[i][j] != 2 && grid[i][j] == 1) {
					return -1;
				}
			}
		}
		return maxTime;

	}
}

class Pair1{
	int first;
	int second;
	int time;
	public Pair1(int first, int second, int time) {
		this.first = first;
		this.second = second;
		this.time = time;
	}
}