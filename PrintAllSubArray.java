package Day4;

public class PrintAllSubArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		//subarray means consecutive element of an array
		printAllSubArray(arr);
	}

	private static void printAllSubArray(int[] arr) {

		int n = arr.length;
		for(int i = 0 ; i< n ;i++) {
			for(int j = i ; j < n;j++) {
				for(int k = i; k<=j; k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
}
