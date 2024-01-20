package Day13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementNew {

	public static void main(String[] args) {
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };
		int[] ans = nextGreaterElement(nums1, nums2);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] nextGreaterElement(int[] nums1, int[] nums2) {

		Stack<Integer> stack = new Stack<>();
		Map<Integer, Integer> map = new HashMap<>();
		int n1 = nums1.length;
		int n2 = nums2.length;
		int[] ans = new int[n1];
		for (int i = n2 - 1; i >= 0; i--) {
			int a = nums2[i];
			if (stack.isEmpty()) {
				stack.push(a);
				map.put(a, -1);
				continue;
			}
			if (a < stack.peek()) {
				map.put(a, stack.peek());
				stack.push(a);
				continue;
			}
			while (!stack.isEmpty() && a >= stack.peek()) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				map.put(a, -1);
			} else {
				map.put(a, stack.peek());
			}
			stack.push(a);
		}
		System.out.println(map);

		for (int i = 0; i < n1; i++) {
			ans[i] = map.get(nums1[i]);
		}
		return ans;
	}
}
