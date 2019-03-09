/*
 * it is a sequence of numbers where the next number is the sum of the previous two numbers.
 */
package misc1;

public class Fibonacci {

	public static void main(String[] args) {

			int fib = fib(3);
			System.out.println(fib);
	}

	private static int fib(int num) {
		if(num==1||num==2) {
			return 1;
		}else {
			return (fib(num-1) + fib(num-2));
		}
	}
}
