package Day26;

import java.util.Arrays;

public class RodCutting {

	public static void main(String[] args) {

		int[] price = {1,5,6,9,11,12,14,16};
		int n = 8;
		int ans = rodCut(price,n);
		System.out.println(ans);
	}

	private static int rodCut(int[] price, int n) {

		int[] dp = new int[n+1];
		dp[0] = 0;
		for(int i = 1; i<=n; i++) {
			for(int j = 0; j< i;j++) {
				dp[i] = Math.max(dp[i], price[j]+ dp[i-j-1]);
			}
		}
		System.out.println(Arrays.toString(dp));
		return dp[n];
	}

}
