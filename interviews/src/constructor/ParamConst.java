package constructor;

public class ParamConst {
	
	private int var;
	public ParamConst() {
		this.var = 10;
		System.out.println("No-arg constructor.");
	}
	public ParamConst(int num) {
		this.var = num;
		System.out.println("Arg constructor.");
	}
	public int getValue() {
		return var;
	}

	public static void main(String[] args) {
		ParamConst obj1 = new ParamConst();
		ParamConst obj2 = new ParamConst(100);
		System.out.println(obj1.getValue());
		System.out.println(obj2.getValue());

			
	}

}
