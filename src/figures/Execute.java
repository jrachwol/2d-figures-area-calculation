package figures;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle (10);
		System.out.println("Pole ko³a = " + circle.calculateArea());
		
		Rectangle rectangle = new Rectangle (5, 4);
		System.out.println("Pole prostok¹ta = " + rectangle.calculateArea());
		
		Square square = new Square(5);
		System.out.println("Pole kwadratu = " + square.calculateArea());
		
		Trapezoid trapezoid = new Trapezoid(1, 2, 3, 4);
		System.out.println("Pole trapezoidu = " + trapezoid.calculateArea());
		
		Triangle triangle = new Triangle(20, 30);
		System.out.println("Pole trójk¹ta = " + triangle.calculateArea());
	}	
	
}
