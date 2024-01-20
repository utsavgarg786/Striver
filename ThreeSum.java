package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {

		int[] arr = {-1,0,1,2,-1,-4};
		int target = 0;
		List<List<Integer>> list = threeSum(arr, target);
		System.out.println(list);
	}

	private static List<List<Integer>> threeSum(int[] arr, int target) {

		int n = arr.length;
		Set<List<Integer>> set = new HashSet<>();
		Arrays.sort(arr);
		for(int i = 0 ; i< n-2; i++) {
			int start = i+1;
			int end = n-1;
			while(start<end) {
				int sum = arr[i] + arr[start]+ arr[end];
				if(sum == target) {
					set.add(Arrays.asList(arr[i], arr[start], arr[end]));
					start++;
					end--;
				}
				else if(sum < target) {
					start++;
				}
				else {
					end--;
				}
			}
		}
		return new ArrayList<>(set);
	}

}
