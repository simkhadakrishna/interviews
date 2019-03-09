package composition3;

public class Test {

	public static void main(String[] args) {
		
		Wall wall1 = new Wall("east");
		Wall wall2 = new Wall("west");
		Wall wall3 = new Wall("north");
		Wall wall4 = new Wall("south");
		
		Ceiling ceiling = new Ceiling(15, "blue");
		
		Bed bed = new Bed("king", 10, 10, 10, 10);
		
		Lamp lamp = new Lamp("R13", true, 302);
		
		Bedroom bedroom = new Bedroom("Krishna", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		
		bedroom.getLamp().turnOn();
		 bedroom.makeBed();
	}

}
