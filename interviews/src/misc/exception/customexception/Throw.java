package misc.exception.customexception;

public class Throw {
	public static void main(String[] args) {
		try {
			validateAge(19);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(" You are not eligible to vote.");
		}
		
	}

	private static void validateAge(int age) {
		if(age < 18) {
			throw new InvalidAgeException("Age " + age + " is not valid to vote.");
		}else {
			System.out.println(" You are elligible to vote.");
		}
	}

}
