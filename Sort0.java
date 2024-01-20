package Day1;

import java.util.Arrays;

public class Sort0 {

	public static void main(String[] args) {

		int[] arr = {2,0,2,1,1,0};
		int[] ans = sort0And1And2(arr);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] sort0And1And2(int[] arr) {

		int start = 0;
		int middle = 0;
		int end = arr.length-1;
		while(middle<= end) {
			switch (arr[middle]) {
			case 0:
				swap(arr, start, middle);
				start++;
				middle++;
				break;
			case 1:
				middle++;
				break;
			case 2:
				swap(arr,middle,end);
				end--;
				break;

			default:
				break;
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}


}
