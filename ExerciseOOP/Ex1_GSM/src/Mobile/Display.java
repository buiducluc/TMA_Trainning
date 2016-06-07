package Mobile;

public class Display {
	private float size;
	private int numberOfColor;
	
	public Display(){
		
	}
	
	public Display(float size, int numberOfColor){
		this.size = size;
		this.numberOfColor = numberOfColor;
	}

	@Override
	public String toString() {
		return "Display [size=" + size + ", numberOfColor=" + numberOfColor + "]";
	}

	public float getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumberOfColor() {
		return numberOfColor;
	}

	public void setNumberOfColor(int numberOfColor) {
		this.numberOfColor = numberOfColor;
	}
	
	
}
