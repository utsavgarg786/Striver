package Day25;

import java.util.ArrayList;
import java.util.List;

public class PowerSet1 {

	public static void main(String[] args) {

		String s = "abc";
		List<List<Character>> result = powerSet(s);
		System.out.println(result);
	}

	private static List<List<Character>> powerSet(String s) {
		List<List<Character>> result = new ArrayList<>();
		int n = s.length();
		int size = (int) Math.pow(2, n);
		
		for(int i = 0 ; i< size ;i++) {
			List<Character> ans = new ArrayList<>();
			for(int j = 0; j< n ; j++) {
				if((i &(1<<j)) != 0) {
					ans.add(s.charAt(j));
				}
			}
			result.add(ans);
		}
		return result;
	}

}
