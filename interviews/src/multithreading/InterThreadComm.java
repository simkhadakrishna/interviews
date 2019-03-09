package multithreading;

public class InterThreadComm {
	private int i;
	
	private boolean produced = false;
	
	public synchronized void produce(int x) {
		if(produced) {
			System.out.println("produced: " + x);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i = x;
			produced = true;
			notify();
		}
	}
	public synchronized void consumed() {
		if(!produced) {
			System.out.println("consumed: ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			produced = false;
			notify();
		}
	}

}
