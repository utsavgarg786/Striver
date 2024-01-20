package Day4;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 9, 6, 5, -1, 10, 11, 12 };
		int ans = longestConsecutiveSequence(arr);
		System.out.println(ans);
	}

	private static int longestConsecutiveSequence(int[] arr) {

		int n = arr.length;
		int max = 0;
		Map<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(arr[i], false);
		}
		for (int i = 0; i < n; i++) {
			int count = 1;
			if (map.get(arr[i]) == false) {
				map.put(arr[i], true);
				int nextNum = arr[i] + 1 ; 
				while (map.containsKey(nextNum) && map.get(nextNum) == false) {
					count++;
					map.put(nextNum, true);
					nextNum++;
				}
				int prevNum = arr[i] - 1;
				while(map.containsKey(prevNum) && map.get(prevNum) == false) {
					count++;
					map.put(prevNum, true);
					prevNum--;
				}
			}
			if(count > max) {
				max = count;
			}
		}
		return max;
	}

}
