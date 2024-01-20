package Day25;

import java.util.Arrays;

public class LongestCommonSubsequence {

	public static void main(String[] args) {

		String s1 = "abcdaf";
		String s2 = "acbcf";
		int ans = longestCommonSubsequence(s1,s2);
		System.out.println(ans);
	}

	private static int longestCommonSubsequence(String s1, String s2) {

		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m+1][n+1];
		System.out.println(dp);
		for(int i = 1; i<=m; i++) {
			for(int j = 1; j<=n; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		System.out.println(Arrays.deepToString(dp));
		return dp[m][n];
	}

}
