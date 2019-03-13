package queue;

public class PrinterTest {

	public static void main(String[] args) {

		Printer p = new Printer();
		p.insert(5);
		p.insert(6);
		p.insert(7);
		p.insert(8);
		p.insert(9);
		p.delete();
		p.delete();

		p.traverse();
	}

}
