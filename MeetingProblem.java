package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MeetingProblem {

	public static void main(String[] args) {
		int[] start = { 1, 0, 3, 8, 5, 8 };
		int[] end = { 2, 6, 4, 9, 7, 9 };
		meetingProb(start, end);

	}

	private static void meetingProb(int[] start, int[] end) {

		int n = start.length;
		List<Meeting> meet = new ArrayList<>();
		for(int i = 0; i< n ; i++ ) {
			meet.add(new Meeting(start[i], end[i], i+1));
		}
		MeetingComparator comparator = new MeetingComparator();
		Collections.sort(meet, comparator);
		
		List<Integer> ans = new ArrayList<>();
		ans.add(meet.get(0).pos);
		int limit = meet.get(0).end;
		
		for(int i = 1 ; i< n ; i++) {
			if(meet.get(i).start > limit) {
				ans.add(meet.get(i).pos);
				limit = meet.get(i).end;
			}
		}
		System.out.println(ans);
	}

}

class Meeting {
	int start;
	int end;
	int pos;

	public Meeting(int start, int end, int pos) {
		super();
		this.start = start;
		this.end = end;
		this.pos = pos;
	}
}

class MeetingComparator implements Comparator<Meeting> {
	@Override
	public int compare(Meeting obj1, Meeting obj2) {
		if (obj1.end > obj2.end) {
			return 1;
		} else if (obj1.end < obj2.end) {
			return -1;
		} else {
			return 0;
		}
	}
}