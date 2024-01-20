package Day1;

import java.util.Arrays;

public class SetMatrixZeroes1 {

	public static void main(String[] args) {

		int[][] arr = {{1,1,1,1},{1,0,1,1},{1,1,0,1},{1,0,0,1}};
		int[][] ans = setMatrixZero(arr);
		//Space complexity is O(n) because of row and column arr
		System.out.println(Arrays.deepToString(ans));
	}

	private static int[][] setMatrixZero(int[][] arr) {

		int m = arr.length;
		int n = arr[0].length;
		boolean[] row = new boolean[m];
		Arrays.fill(row, false);
		boolean[] col = new boolean[n];
		Arrays.fill(col, false);
		for(int i = 0; i< m ; i++) {
			for(int j = 0; j< n; j++) {
				if(arr[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		for(int i = 0; i< m ; i++) {
			for(int j = 0; j< n; j++) {
				if(row[i] == true || col[j] == true) {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}

}
