package Day8;

import java.util.Arrays;
import java.util.Comparator;

public class KnapsackProblem {

	public static void main(String[] args) {

		int w = 50;
		int n = 3;
		int[] value = { 100, 60, 120 };
		int[] weight = { 20, 10, 30 };
		int ans = maximumProfit(w, n, value, weight);
		System.out.println(ans);
	}

	private static int maximumProfit(int w, int n, int[] value, int[] weight) {

		ItemComparator comparator = new ItemComparator();
		//Arrays.sort(value, comparator);
		return 0;
	}

}

class Item {
	int value;
	int weight;

	public Item(int value, int weight) {
		super();
		this.value = value;
		this.weight = weight;
	}

}

class ItemComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {

		double r1 = o1.value / o1.weight();
		double r2 = o2.getValue() / o2.getWeight();
		if (r1 < r2) {
			return 1;
		} else if (r1 > r2) {
			return -1;
		} else {
			return 0;
		}
	}
}
