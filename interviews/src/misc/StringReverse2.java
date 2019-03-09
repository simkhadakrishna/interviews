package misc;

public class StringReverse2 {

	public static void main(String[] args) {

			String str = "wel come to my home";
			String reverseString = reverseString(str);
			System.out.println(reverseString);
	}

	private static  String reverseString(String str) {
		if(str.isEmpty()) 
			return str;
			return reverseString(str.substring(1)) + str.charAt(0);	
	}

}
