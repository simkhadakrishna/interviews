package misc1;

import java.util.Scanner;

public class FibonacciDemo {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.print(" 0 1 ");
		while(k<=n) {
			k = a+b;
			if(k>n) {
				break;
			}
			System.out.print(k + " ");
			a = b;
			b = k;
		}
		sc.close();
	}

}
