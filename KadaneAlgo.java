package Day4;

public class KadaneAlgo {

	public static void main(String[] args) {
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		int ans = maximumSubAray(arr);
		System.out.println(ans);
	}

	private static int maximumSubAray(int[] arr) {

		int maxSum = 0;
		int sum = 0;
		int start = 0;
		int end = 0;
		int s = 0;
		for(int i = 0 ; i< arr.length ; i++) {
			sum = sum + arr[i];
			if(sum> maxSum) {
				maxSum = sum; 
				start = s; 
				end = i;
			}
			if(sum< 0) {
				sum = 0;
				s= i+1;
			}
		}
		System.out.println(start);
		System.out.println(end);
		return maxSum;
	}

}
