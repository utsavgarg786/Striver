package Day4;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = {16,4,23,8,15,42,1,2};
		int[] ans = bubbleSort(arr);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] bubbleSort(int[] arr) {

		int n = arr.length;
		for(int i = 0; i< n ; i++) {
			for(int j = i+1 ; j< n ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

}
