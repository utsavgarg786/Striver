package Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElements {

	public static void main(String[] args) {

		int n =3;
		int[] arr= {2,3,2};
		int ans = majorityElements(arr,n);
		System.out.println(ans);
	}

	private static int majorityElements(int[] arr, int n) {

		Map<Integer, Integer> map = new HashMap<>();
		for(int c : arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		Set<Integer> set = map.keySet();
		for(int a : set) {
			if(map.get(a)> n/2) {
				return map.get(a);
			}
		}
		return -1;
	}

}
