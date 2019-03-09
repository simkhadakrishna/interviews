package misc;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 3;
		int status = 1;
		System.out.print(2 + " ");

		for (int i = 2; i <= 15;) {
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					status = 5;
					break;
				}
				}
			if (status != 5) {
				System.out.print(num + " ");
				i++;
			}
			status = 1;
			num++;
		}
	}
}
