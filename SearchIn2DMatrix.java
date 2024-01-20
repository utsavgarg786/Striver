package Day3;

public class SearchIn2DMatrix {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int target = 13;
		boolean ans = search(arr, target);
		System.out.println(ans);
	}

	private static boolean search(int[][] arr, int target) {

		int m = arr.length;
		int n = arr[0].length;
		
		for(int i = 0; i< m; i++) {
			for(int j =0; j< n;j++) {
				if(arr[i][j] != target) {
					continue;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}

}
