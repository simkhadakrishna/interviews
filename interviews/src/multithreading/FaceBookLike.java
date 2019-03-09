package multithreading;

public class FaceBookLike {
	private int likes;
	
	public FaceBookLike(int likes) {
		this.likes = likes;
	}
	
	public synchronized void likes() {
		likes++;
		
		System.out.println(Thread.currentThread().getName() + " likes: " + likes);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
