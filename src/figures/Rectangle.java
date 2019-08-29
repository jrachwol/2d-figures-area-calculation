package figures;

public class Rectangle implements Figure {

	private double hight;
	private double width;
	
	public Rectangle (double hight, double width) {
		this.hight = hight;
		this.width = width;
	}
	
	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double calculateArea () {
		return this.hight * this.width;
	}
	
}
