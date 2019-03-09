package misc;

public class Pallindrom {

	public static void main(String[] args) {
		int num = 23479;

		checkPallindrom(num);

	}

	public static int checkPallindrom(int num) {
		int s = 0;
		int r;
		int t = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			s = s * 10 + r;
		}
		if (t == s) {
			System.out.println(t + " is a pallindrom number");
		} else {
			System.out.println(t + " is not a pallindrom number.");
			System.out.println(s);
		}
		return s;

	}
}
