package clone.clone;

public class STU implements Cloneable{

/*
 * Cloneable is a marker interface. A marker interface generally gives the permission.
 */
	
	int i;
	int j;
	@Override
	public String toString() {
		return "STU [i=" + i + ", j=" + j + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
