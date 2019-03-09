package misc;

public class Average {

	public static void main(String[] args) {

			int[] arr = {3, 6, 8, 10, 17, 21};
			double total = 0;
			
			for(int i = 0; i<=arr.length-1; i++) {
				total = total + arr[i];
			}
			double average = total/arr.length;
			System.out.format("Average = %.3f",  average);
	}

}
