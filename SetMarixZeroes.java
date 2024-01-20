package Day1;

import java.util.Arrays;

public class SetMarixZeroes {

	public static void main(String[] args) {

		int[][]  arr= {{1,1,1}, {1,0,1} ,{1,1,1} };
		int[][] ans = setMatricsZero(arr);
		//TimeComplexity is O(n3)
		System.out.println(Arrays.deepToString(ans));
	}

	private static int[][] setMatricsZero(int[][] arr) {

		int m = arr.length;
		int n = arr[0].length;
		for(int i = 0; i< m; i++) {
			for(int j = 0; j< n; j++) {
				if(arr[i][j] == 0) {
					markRow(i, arr,n);
					markCol(j, arr,m);
				}
			}
		}
		for(int i = 0 ; i< m; i++) {
			for(int j= 0; j< n; j++) {
				if(arr[i][j] == -1) {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}

	private static void markCol(int j, int[][] arr, int m) {

		for(int i = 0 ; i< m ; i++) {
			if(arr[i][j] != 0) {
				arr[i][j] = -1;
			}
		}
	}

	private static void markRow(int i, int[][] arr, int n) {

		for(int j= 0; j< n; j++) {
			if(arr[i][j] != 0) {
				arr[i][j] = -1;
			}
		}
	}

}
