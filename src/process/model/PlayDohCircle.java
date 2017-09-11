package process.model;

public class PlayDohCircle {
	//Declaration Section
	//Data Member Section
	private int size;
	
	public PlayDohCircle() {
		this.size = 5;
	}
	
	public PlayDohCircle(int size) {
		this.size = size;
	}
	
	public String toString() {
		String description = "I am a circle, my sie is " + size;
		return description;
	}
}
