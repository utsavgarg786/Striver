package Day4;

import java.util.HashSet;
import java.util.Set;

public class Sum2 {

	public static void main(String[] args) {

		int[] arr = {2,6,5,8,11};
		int target = 15;
		boolean ans = sum2(arr,target);
		System.out.println(ans);
	}

	private static boolean sum2(int[] arr, int target) {

		int n = arr.length;
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			set.add(arr[i]);
		}
		for(int i = 0 ; i< n ; i++) {
			if(set.contains(target- arr[i])) {
				return true;
			}
		}
		return false;
	}

}
