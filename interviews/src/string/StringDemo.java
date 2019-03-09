package string;

public class StringDemo {

	public static void main(String[] args) {
		 
		String str = new String("Hello");
		StringBuffer buffer = new StringBuffer("Hello ");
		StringBuilder builder = new StringBuilder("Hello ");
		
		str.concat("Hi....");
		buffer.append("Hi.....");
		builder.append("Hi......");
		
		System.out.println(str);
		System.out.println(buffer);
		System.out.println(builder);
	}

}
