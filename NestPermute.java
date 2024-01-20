package Day9;

import java.util.ArrayList;
import java.util.List;

public class NestPermute {

	public static void main(String[] args) {

		int[] nums = {1,2,3};
		List<List<Integer>> result = permute(nums);
		System.out.println(result);
	}

	private static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> resultList = new ArrayList<>();
		backTracking(resultList, new ArrayList<>(), nums);
		return resultList;
	}

	private static void backTracking(List<List<Integer>> resultList, List<Integer> tempList, int[] nums) {

		if(tempList.size() == nums.length) {
			resultList.add(new ArrayList<>(tempList));
			return;
		}
		for(int num : nums) {
			if(tempList.contains(num)) {
				continue;
			}
			tempList.add(num);
			backTracking(resultList, tempList, nums);
			tempList.remove(tempList.size()-1);
		}
	}

}
