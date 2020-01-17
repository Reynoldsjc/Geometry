public class TriangleTester
{
	public static void main(String[] args)
	{
		Triangle triangle1 = new Triangle(1, 2, 3, 1, 2, 3);
		Triangle triangle2 = new Triangle(15, 23, 34, 69, 12, 7);
		
		System.out.println(triangle1.area());
		System.out.println(triangle2.area());
	}
}