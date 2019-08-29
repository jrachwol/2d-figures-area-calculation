package figures;

public class Trapezoid {

	private double sideA;
	private double sideB;
	private double hightA;
	private double hightB;

	public Trapezoid (double sideA, double sideB, double hightA, double hightB) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.hightA = hightA;
		this.hightB = hightB;
	}
	
	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getHightA() {
		return hightA;
	}

	public void setHightA(double hightA) {
		this.hightA = hightA;
	}

	public double getHightB() {
		return hightB;
	}

	public void setHightB(double hightB) {
		this.hightB = hightB;
	}

	public double calculateArea () {
		return (sideA * hightA)/2 + (sideB * hightB)/2;
	}
	
}
