package process.model;

public class Rope {
	
	private int size;
	private String color;
	
	public Rope(int size, String color) {
		this.size = size;
		this.color = color;
	}
	
	public String toString() {
		String description = "I am a rope. I am " + size + " feet long and I am " + color + ".";
		return description;
	}
}
