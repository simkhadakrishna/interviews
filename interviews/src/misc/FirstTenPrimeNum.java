package misc;

public class FirstTenPrimeNum {

	public static void main(String[] args) {

		prime(10);
	}

	private static void prime(int num) {
		int numb = 3;
		int status = 1;
		System.out.print(2 + " ");
		for (int i = 2; i <= 10;) {
			for (int j = 2; j <= Math.sqrt(numb); j++) {
				if (numb % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0) {
				System.out.print(numb + " ");
				i++;
			}
			status = 1;
			numb++;

		}

	}

}
