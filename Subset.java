package Day9;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	public static void main(String[] args) {

		int[] nums = {1,2,3};
		List<List<Integer>> result = subSet(nums);
		System.out.println(result);
	}

	private static List<List<Integer>> subSet(int[] nums) {

		List<List<Integer>> resultList = new ArrayList<>();
		int start = 0;
		backTrack(resultList, new ArrayList<>(), nums, start);
		return resultList;
	}

	private static void backTrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums, int start) {

		resultList.add(new ArrayList<>(tempList));
		for(int i = start; i< nums.length; i++) {
			tempList.add(nums[i]);
			backTrack(resultList, tempList, nums, i+1);
			tempList.remove(tempList.size()-1);
		}
	}

}
