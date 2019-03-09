package multithreading;

public class FaceBookLikeTest {

	public static void main(String[] args) {

		final FaceBookLike obj = new FaceBookLike(100);
		
		Thread ramT = new Thread() {
			@Override
			public void run() {
				obj.likes();
			}
		};
		ramT.setName("ram");
		
		Thread samT = new Thread() {
			@Override
			public void run() {
				obj.likes();
			}
		};
		samT.setName("sam");
		
		Thread hariT = new Thread() {
			@Override
			public void run() {
				obj.likes();
			}
		};
		hariT.setName("hari");
		
		Thread sivaT = new Thread() {
			@Override
			public void run() {
				obj.likes();
			}
		};
		sivaT.setName("siva");
		
		ramT.start();
		samT.start();
		hariT.start();
		sivaT.start();
	}

}
