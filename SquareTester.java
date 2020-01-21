public class SquareTester
{
	public static void main(String[] args)
	{
		Point point1 = new Point(0, 0);
		Point point2 = new Point(0, 1);

		Square square = new Square(point1, point2);

		System.out.println("The area is " + square.area());
		System.out.println("The perimeter is " + square.perimeter());
	}
}