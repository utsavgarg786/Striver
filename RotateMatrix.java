package Day2;

import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {

		//int[][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] ans = rotateMatrix(arr);
		System.out.println(Arrays.deepToString(ans));
	}

	private static int[][] rotateMatrix(int[][] arr) {

		int n =arr.length;
		for(int i = 0; i< (n+1)/2 ;i++) {
			for(int j = 0; j< n/2 ; j++) {
				int temp = arr[n-j-1][i];
				arr[n-j-1][i] = arr[n-i-1][n-j-1];
				arr[n-i-1][n-j-1] = arr[j][n-i-1];
				arr[j][n-i-1] = arr[i][j];
				arr[i][j] = temp;
			}
		}
		return arr;
	}

}
