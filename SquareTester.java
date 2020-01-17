public class SquareTester
{
	public static void main(String[] args)
	{
		Square square = new Square(4);

		System.out.println("The area is " + square.area());
		System.out.println("The perimeter is " + square.perimeter());
	}
}