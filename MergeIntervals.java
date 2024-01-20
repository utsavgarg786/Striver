package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {

		int[][] intervals = {{1,3},{8,10},{2,6},{15,18}};
		int[][] ans = merge(intervals);
		System.out.println(Arrays.deepToString(ans));
	}

	private static int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
		
		List<int[]> result = new ArrayList<>();
		int[] newInterval = intervals[0];
		result.add(newInterval);
		for(int[] interval : intervals) {
			if(interval[0] <= newInterval[1]) {
				newInterval[1] = Math.max(interval[1], newInterval[1]);
			}
			else {
				newInterval = interval;
				result.add(newInterval);
			}
		}
		return result.toArray(new int[result.size()][]);
	}

}
