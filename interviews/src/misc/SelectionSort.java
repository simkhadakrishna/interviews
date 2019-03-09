package misc;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 9, 4, 6, 3, 5, 2 };
		
		for (int i = 1; i <= arr.length-1; i++) {
			for (int j = 0; j <= arr.length-2; j++) {
				
				if (arr[j+1] < arr[j]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}

		}
		for (int d = 0; d <= arr.length-1; d++) {
			System.out.print(arr[d] + " ");
		}
	}

}
