package Day8;

import java.util.Arrays;

public class CoinsProblem1 {

	public static void main(String[] args) {

		int n = 18;
		int[] arr = {1,5,7};
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		int ans = minCoins(n ,arr, dp);
		System.out.println(ans);
		System.out.println(Arrays.toString(dp));
	}

	private static int minCoins(int n, int[] arr, int[] dp) {

		if (n == 0) {
			return 0;
		}
		int ans  = Integer.MAX_VALUE;
		for(int i = 0; i< arr.length; i++) {
			int subAns = 0;
			if(n-arr[i] >= 0) {
				if(dp[n-arr[i]] != -1) {
					subAns = dp[n-arr[i]];
				}
				else {
				subAns = minCoins(n-arr[i], arr, dp);
				}
				if(subAns + 1 < ans) {
					ans = subAns+1;
				}
			}
		}
		dp[n] = ans;
		return ans;
	}

}
