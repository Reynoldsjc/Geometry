public class TriangleTester
{
	public static void main(String[] args)
	{
		Point point1 = new Point(0, 0);
		Point point2 = new Point(0, 1);
		Point point3 = new Point(1, 0);

		Triangle triangle1 = new Triangle(point1, point2, point3);
		
		System.out.println(triangle1.area());
	}
}