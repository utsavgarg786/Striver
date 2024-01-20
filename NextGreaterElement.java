package Day13;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {

		int[] nums = {3,10,4,2,1,2,6,1,7,2,9};
		int[] ans = nextGreaterElement(nums);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] nextGreaterElement(int[] nums) {

		int n = nums.length;
		int[] ans = new int[n];
		Stack<Integer> stack = new Stack<>();
		for(int i = n-1; i>= 0; i--) {
			if(stack.isEmpty()) {
				ans[i] = -1;
				stack.push(nums[i]);
				continue;
			}
			if(nums[i] < stack.peek()) {
				ans[i] = stack.peek();
				stack.push(nums[i]);
				continue;
			}
			while(!stack.isEmpty() && nums[i] >= stack.peek()) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
			}else {
				ans[i] = stack.peek();
			}
			stack.push(nums[i]);
		}
		return ans;
	}

}
