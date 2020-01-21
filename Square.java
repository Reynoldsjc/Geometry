class Square
{
	private int side;
	private int area;
	private int perimeter;
	private Point pOne;
	private Point pTwo;

	public Square(Point pOne, Point pTwo)
	{
		this.side = side;
		this.area = area;
		this.perimeter = perimeter;
		this.pOne = pOne;
		this.pTwo = pTwo;
	}

	public int side()
	{
		side = pOne.distance(pTwo) * Math.sqrt(2);
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

	public boolean intersect(Square square2)
	{
		if (pOne.getX())
			if (pOne.getX() + side >= square2.pOne.getX() || pOne.getX() - side <= square2.pOne.getX(){
				return false;
			} else if (pOne.getY() + side >= square2.pOne.getY() || pOne.getX() - side <= square2.pOne.getY(){
				return false;
			} else if (pTwo.getX() + side >= square2.pTwo.getX() || pTwo.getX() - side <= square2.pTwo.getX(){
				return false;
			} else if (pTwo.getY() + side >= square2.pTwo.getY() || pTwo.getY() - side <= square2.pTwo.getY(){
				return false;
			} else{
				return true;
			}

	}
}