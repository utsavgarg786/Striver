package Day1;

import java.util.Arrays;

public class Sort0And1And2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,0,2,1,1,0};
		int[] ans = sort(arr);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] sort(int[] arr) {
		
		int n = arr.length;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i< n; i++) {
			if(arr[i] == 0) {
				count0++;
			}
			else if(arr[i] == 1) {
				count1++;
			}else {
				count2++;
			}
		}
		for(int i = 0; i< count0; i++) {
			arr[i] = 0;
		}
		for(int i = count0; i< count0+count1; i++) {
			arr[i] = 1;
		}
		for(int i = count0+count1; i< count0+count1+count2; i++) {
			arr[i] = 2;
		}
		return arr;
	}

}
