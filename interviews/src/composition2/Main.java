package composition2;

public class Main {

	public static void main(String[] args) {
		
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("100B", "Dell", "204", dimensions);
		
		Monitor theMonitor = new Monitor("201A", "Hitashi", 42, new Resolution(2550,2550));
		
		Motherboard theMotherboard = new Motherboard("B-200", "Asus", 8, "6", "v 2.01");
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
		thePC.getMonitor().drawPixelAt(1500, 1200, "red");
		thePC.getMotherboard().loadProgram("windows 1.0");
		thePC.getTheCase().pressPowerButtom();
	}

}
