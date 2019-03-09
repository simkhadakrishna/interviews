package composition2;

public class Motherboard {
	private String model;
	private String manufacturer;
	private int ramSlots;
	private String cardSlots;
	private String bios;
	public Motherboard(String model, String manufacturer, int ramSlots, String cardSlots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is now loading.....");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public void setRamSlots(int ramSlots) {
		this.ramSlots = ramSlots;
	}
	public String getCardSlots() {
		return cardSlots;
	}
	public void setCardSlots(String cardSlots) {
		this.cardSlots = cardSlots;
	}
	public String getBios() {
		return bios;
	}
	public void setBios(String bios) {
		this.bios = bios;
	}
	

}
