package Day9;

import java.util.ArrayList;
import java.util.List;

public class SubSetII {

	public static void main(String[] args) {

		int[] arr = {1,2,2};
		List<List<Integer>> result = subset2(arr);
		System.out.println(result);
	}

	private static List<List<Integer>> subset2(int[] arr) {

		List<List<Integer>> resultList = new ArrayList<>();
		int start =0;
		backTrack(resultList, new ArrayList<>(), arr, start);
		return resultList;
	}

	private static void backTrack(List<List<Integer>> resultList, List<Integer> tempList, int[] arr, int start) {

		if(resultList.contains(tempList)) {
			return;
		}
		resultList.add(new ArrayList<>(tempList));
		for(int i = start; i< arr.length; i++) {
			tempList.add(arr[i]);
			backTrack(resultList, tempList, arr, i+1);
			tempList.remove(tempList.size()-1);
		}
	}

}
