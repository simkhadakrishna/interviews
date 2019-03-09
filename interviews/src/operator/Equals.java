package operator;

public class Equals {

	public static void main(String[] args) {

			String str1 = new String("hello");
			String str2 = new String("hello");
			
			if(str1==str2) {
				System.out.println("str1 == str2");
			}else {
				System.out.println("str1!=str2");
			}
			if(str1.equals(str2)) {
				System.out.println("str1 equals str2");
			}else {
				System.out.println("str1 is not equal to str2.");
			}
	}

}
