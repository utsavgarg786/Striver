package Graph;

import java.util.Arrays;

public class GraphIntroUsingMatrix {

	public static void main(String[] args) {
		int m = 3, n= 3;
		int[][] ans = graphIntro(n);
		System.out.println(Arrays.deepToString(ans));
	}

	private static int[][] graphIntro(int n) {
		int[][] adj = new int[n+1][n+1];

		adj[1][2] = 1;
		adj[2][1] = 1;
		
		adj[1][3] = 1;
		adj[3][1] = 1;
		
		adj[2][3] = 1;
		adj[3][2] = 1;
		
		return adj;
	}

}
