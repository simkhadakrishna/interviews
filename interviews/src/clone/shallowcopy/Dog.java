package clone.shallowcopy;

public class Dog implements Cloneable{
	
	Cat c;
	int i;
	
	public Dog(Cat c, int i) {
		this.c = c;
		this.i = i;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Dog [c=" + c + ", i=" + i + "]";
	}

}
