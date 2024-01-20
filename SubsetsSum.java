package Day9;

import java.util.ArrayList;
import java.util.List;

public class SubsetsSum {

	public static void main(String[] args) {

		int[] nums = {1,2,3};
		List<List<Integer>> result = subsetsSum(nums);
		System.out.println(result);
	}

	private static List<List<Integer>> subsetsSum(int[] nums) {

		List<List<Integer>> resultList = new ArrayList<>();
		int start = 0;
		backTrack(resultList, new ArrayList<>(), nums, start);
		for(int i = 0 ; i< resultList.size(); i++) {
			List<Integer> ans = resultList.get(i);
			int sum = 0;
			for(int j = 0; j< ans.size(); j++) {
				sum = sum+ ans.get(j);
			}
			System.out.println(sum);
		}
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
