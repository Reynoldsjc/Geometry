import java.util.*;
class Triangle
{
	private double area;

	private Point pOne;
	private Point pTwo;
	private Point pThree;

	public Triangle(Point pOne, Point pTwo, Point pThree)
	{
		this.pOne = pOne;
		this.pTwo = pTwo;
		this.pThree = pThree;
	}

	public double area()
	{
		area = Math.abs(0.5 * (pOne.getX() * (pTwo.getY() - pThree.getY()) + pTwo.getX() * (pThree.getY() - pOne.getY()) + pThree.getX() * (pOne.getY() - pTwo.getY())));
		return area;
	}
}