package multithreading;

public class RunnableTest implements Runnable {

	public static void main(String[] args) {
		RunnableTest r = new RunnableTest();
		Thread obj = new Thread(r);
		obj.start();
		
		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("I am annonynous runnable.");
			}
			
		};
		
		Thread t = new Thread(run);
		t.start();

	}

	@Override
	public void run() {
		System.out.println("This is runnable thread.");
	}
	
	
	
}



