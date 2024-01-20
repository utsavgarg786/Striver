package Day25;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {

		int[] nums = { 3, 4, -1, 0, 6, 2, 3 };
		int ans = longestIncreasingSubsequence(nums);
		System.out.println(ans);
	}

	private static int longestIncreasingSubsequence(int[] nums) {

		int n = nums.length;
		int[] dp = new int[n];
		Arrays.fill(dp, 1);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					if (dp[i] < dp[j] + 1) {
						dp[i] = dp[j] + 1;
					} 
				}
			}
		}
		int max = dp[0];
		for (int i = 0; i < n; i++) {
			if (max < dp[i]) {
				max = dp[i];
			}
		}
		return max;
	}

}
