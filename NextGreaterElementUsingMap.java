package Day13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementUsingMap {

	public static void main(String[] args) {

		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int[] ans = nextGreaterElement(nums1 , nums2);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] nextGreaterElement(int[] nums1, int[] nums2) {

		int n1 = nums1.length;
		int n2 = nums2.length;
		int[] ans = new int[n1];
		Arrays.fill(ans, -1);
		Map<Integer, Integer> map = new HashMap<>();
		for(int i= 0 ; i< n2; i++) {
			map.put(nums2[i], i);
		}
		for(int i = 0 ; i< n1 ; i++) {
			int index = map.get(nums1[i]);
			for(int j = index+1 ; j < n2 ; j++) {
				if(nums1[i] < nums2[j]) {
					ans[i] = nums2[j];
					break;
				}
			}
		}
		return ans;
	}

}
