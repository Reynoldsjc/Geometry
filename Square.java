class Square
{
	private int side;
	private int area;
	private int perimeter;

	public Square(int side)
	{
		this.side = side;
		this.area = area;
		this.perimeter = perimeter;
	}

	public int area()
	{
		area = side * side;
		return area;
	}

	public int perimeter()
	{
		perimeter = side * 4;
		return perimeter;
	}
}