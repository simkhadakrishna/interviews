package composition3;

public class Lamp {
	private String style;
	private boolean batteries;
	private int glowRating;
	public Lamp(String style, boolean batteries, int glowRating) {
		super();
		this.style = style;
		this.batteries = batteries;
		this.glowRating = glowRating;
	}
	public String getStyle() {
		return style;
	}
	public boolean isBatteries() {
		return batteries;
	}
	public int getGlowRating() {
		return glowRating;
	}
	public void turnOn() {
		System.out.println("light in turned on");
	}

}
