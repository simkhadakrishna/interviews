package multithreading;

public class InterThreadTest {

	public static void main(String[] args) {

		InterThreadComm obj = new InterThreadComm();
		
		Thread prod = new Thread() {
			@Override
			public void run() {
				obj.produce(5);
			}
		};
		prod.start();
		
		Thread cons = new Thread() {
			@Override
			public void run() {
				obj.consumed();
			}
		};
		cons.start();
		
	}

}
