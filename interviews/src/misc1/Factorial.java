/**
 * 
 */

package misc1;

public class Factorial {

	public static void main(String[] args) {

		int fact = fact(5);
		System.out.println(fact);
	}

	private static int fact(int num) {
		if (num <= 1) {
			return 1;
		} else {
			num = num*fact(num-1);
			return num;
		}
	}

}
