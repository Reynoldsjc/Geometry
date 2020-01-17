import java.util.*;
class Triangle
{
	private double area;

	private int x1;
	private int x2;
	private int x3;
	private int y1;
	private int y2;
	private int y3;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}

	public double area()
	{
		area = Math.abs(0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
		return area;
	}
}