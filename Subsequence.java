package Day25;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		List<List<Integer>> result = subsequence(nums);
		System.out.println(result);
	}

	private static List<List<Integer>> subsequence(int[] nums) {

		List<List<Integer>> resultList = new ArrayList<>();
		int start = 0;
		backTrack(resultList, new ArrayList<>(), nums, start);
		for(int i = 0 ; i<resultList.size(); i++) {
			List<Integer> list = resultList.get(i);
			if(list.isEmpty()) {
				resultList.remove(list);
			}
		}
		return resultList;
	}

	private static void backTrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums, int start) {

		resultList.add(new ArrayList<>(tempList));
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			backTrack(resultList, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}

}
