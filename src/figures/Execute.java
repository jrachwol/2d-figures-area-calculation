package figures;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle (10);
		System.out.println(circle.calculateArea());
		
		Rectangle rectangle = new Rectangle (5, 4);
		System.out.println(rectangle.calculateArea());
		
		Square square = new Square(5);
		System.out.println(square.calculateArea());
		
		Trapezoid trapezoid = new Trapezoid(1, 2, 3, 4);
		System.out.println(trapezoid.calculateArea());
		
		Triangle triangle = new Triangle(20, 30);
		System.out.println(triangle.calculateArea());
	}	
	
}
