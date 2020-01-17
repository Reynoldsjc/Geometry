class Point {
    private Point x1;
    private Point y1;
    private Point x2;
    private Point y2;
    private Point x3;
    private Point y3;
    public double getPoints1(Point x1, Point y1) {
       double Point1 = new Point(2,3);
    }
    public double getPoints2(Point x2, Point y2) {
       double Point1 = new Point(-5,5);
    }
     public double getPoints3(Point x3, Point y3) {
       double Point1 = new Point(8,-7);
    }
    public double distance() {
        double Distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
      System.out.println(Distance); 
    }
}
