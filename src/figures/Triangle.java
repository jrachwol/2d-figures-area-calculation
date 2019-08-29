package figures;

public class Triangle {

	private double base;
	private double hight;
	
	public Triangle (double base, double hight) {
		this.base = base;
		this.hight = hight;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double calculateArea () {
		return (base * hight)/2;
	}
	
}
