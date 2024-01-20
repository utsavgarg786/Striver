package Day2;

public class MissingNumber {

	public static void main(String[] args) {

		int[] arr = {1,2,0,3,4,5,6,9,7};
		int ans = missingNumber(arr);
		System.out.println(ans);
	}

	private static int missingNumber(int[] arr) {

		// A XOR 0 = A;
		// A XOR A = 0;
		// A XOR B XOR C = A XOR C XOR B
		int num = 0;
		int n = arr.length;
		int allXor = 0;
		
		for(int i = 0 ; i<=n; i++) {
			allXor = allXor ^ i;
		}
		for(int i= 0 ; i< n ;i++) {
			num = allXor + arr[i];
		}
		return num;
	}

}
