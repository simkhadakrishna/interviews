package misc1;

public class FibonacciDemo2 {
	public static void main(String[] args) {
		
		System.out.print(" 0 1 ");
		
		fibo(0, 1, 10, 2);
	}

	private static void fibo(int i, int j, int k, int l) {
			if(l<k) {
				int num = i + j;
				System.out.print(num + " ");
				fibo(j, num, k, ++l);
			}
	}

}
