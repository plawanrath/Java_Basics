
public class TestSquare {

	public static void main(String[] args) {
		
		Square s1 = new Square();
		Square s2 = new Square(12);
		System.out.print("Area of first square = ");
		System.out.print(s1.getArea());
		System.out.println();
		System.out.print("Area of second square = ");
		System.out.print(s2.getArea());
	}

}
