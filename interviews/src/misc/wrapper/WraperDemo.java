package misc.wrapper;

public class WraperDemo {

	public static void main(String[] args) {
		int i = 10;
		Integer iRef = new Integer(i);
		int j = iRef.valueOf(iRef);
		Integer kRef = i;
		int l = kRef;
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(i);
		System.out.println(iRef);
		System.out.println(j);
		System.out.println(kRef);
		System.out.println(l);
		System.out.println(n);
	}

}
