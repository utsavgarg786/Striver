package Day25;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static void main(String[] args) {

		int[] nums = {1,2,3};
		List<List<Integer>> result = powerSet(nums);
		System.out.println(result);
	}

	private static List<List<Integer>> powerSet(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		int n = nums.length;
		int size = (int) Math.pow(2, n);
		
		for(int i = 0 ; i< size; i++) {
			List<Integer> val = new ArrayList<>();
			for(int j = 0 ; j< n ; j++) {
				if((i & (1<<j)) !=0) {
					val.add(nums[j]);
				}
			}
			result.add(val);
		}
		return result;
	}

}
