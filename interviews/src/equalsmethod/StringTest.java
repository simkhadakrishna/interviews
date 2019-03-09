package equalsmethod;

public class StringTest {

	public static void main(String[] args) {

			String s1 = new String("krishna");
			String s2 = new String("krishna");
			
			String s4 = "ram";
			String s3 = "ram";
			
			System.out.println(s1.equalsIgnoreCase(s2));
			System.out.println(s1==s2);
			
			System.out.println(s3==s4);
			System.out.println(s3.equalsIgnoreCase(s4));
	}

}
