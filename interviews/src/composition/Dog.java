package composition;

public class Dog {
	private String name;
	private Human owner;
	
	public Dog(String name, Human owner) {
		this.name = name;
		this.owner = owner;
	}
	@Override
	public String toString() {
		return String.format("My name is: %s, My owner name is: %s", name, owner);
	}

}
