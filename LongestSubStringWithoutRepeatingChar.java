package Day4;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {
		String s = "abcabcbbabcd";
		int ans = longestUniqueSubString(s);
		System.out.println(ans);
	}

	private static int longestUniqueSubString(String s) {

		int left = 0;
		int right = 0;
		int n = s.length();
		int length = 0;
		Map<Character, Integer> map = new HashMap<>();
		while (right < n) {
			if (map.containsKey(s.charAt(right))) {
				left = Math.max(map.get(s.charAt(right))+1, left);
			}
			map.put(s.charAt(right), right);
			length = Math.max(right - left + 1, length);
			right++;
		}
		return length;
	}
}
