package multithreading;

public class ShutDownHook {

	public static void main(String[] args) {
		
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("shut down hook.");
			}
		};
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("calling system exit.");
		System.exit(0);
		System.out.println("hi.....");
	}

}
