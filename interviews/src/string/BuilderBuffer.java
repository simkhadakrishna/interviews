package string;

public class BuilderBuffer {

	public static void main(String[] args) {

			int N = 9999999;
			long t;
			
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for(int i = N; i-->0; ) {
				sb.append("");	
			}
			System.out.println(System.currentTimeMillis() - t);
			System.out.println("-----------------");
			
			StringBuilder sf = new StringBuilder();
			t = System.currentTimeMillis();
			for(int i = N; i --> 0;) {
				sf.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
	}

}
