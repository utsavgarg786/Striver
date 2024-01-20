package Day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = {16,4,23,8,15,42,1,2};
		int target = 19;
		int[] ans = twoSum(arr, target);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] twoSum(int[] arr, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		int diff = 0;
		int n = arr.length;
		for(int i = 0; i < n ; i++) {
			diff = target -arr[i];
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff), i};
			}
			else {
				map.put(arr[i], i);
			}
		}
		return new int[] {-1 ,-1};
	}

}
