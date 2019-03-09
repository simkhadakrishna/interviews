package misc;

public class Selectionsort1 {

	public void selectionSort(int[] arr) {
		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 2; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 2, 7, 5, 8 };
		System.out.println("Before sort:");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		Selectionsort1 obj = new Selectionsort1();
		obj.selectionSort(arr);
		System.out.println();
		System.out.println("After sort:");
		for (int j = 0; j <= arr.length - 1; j++) {
			System.out.print(arr[j] + " ");
		}

	}

}
