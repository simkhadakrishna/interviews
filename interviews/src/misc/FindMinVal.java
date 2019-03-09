package misc;

public class FindMinVal {

	public int minValue(int[] arr) {
		int min = arr[0];
		for (int a : arr) {
			if (min > a) {
				min = a;
			}

		}
		return min;

	}
	public void print(int minValue) {
		System.out.println("Minimum value of the array = " + minValue);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 7, 1, 6 };

		FindMinVal obj = new FindMinVal();
		int minValue = obj.minValue(arr);
		obj.print(minValue);
	}

}
