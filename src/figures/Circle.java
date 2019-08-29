package figures;
import java.lang.Math;

public class Circle implements Figure {
	
	private double radius;
	private double diameter;
	
	public Circle (double radius) {
		this.radius = radius;
		this.diameter = radius * 2;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double dimention) {
		this.diameter = dimention;
	}

	public double calculateArea () {
		return this.radius * this.radius * Math.PI;
	}

}
