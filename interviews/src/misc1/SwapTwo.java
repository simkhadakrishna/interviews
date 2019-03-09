package misc1;

public class SwapTwo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//int temp;
		
		System.out.println("a: " + a + " b: " + b);
		//swap these numbers
		
		/*temp = a;
		a = b;
		b = temp;
		System.out.println("---------------");
		System.out.println("a: " + a + " b: " + b);*/
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("-----------");
		System.out.println("a: " + a + " b: " + b);
		
	}

}
