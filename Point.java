public class Point {

  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distance(Point point2) {
    double dx = Math.abs(point2.getX() - this.getX());
    double dy = Math.abs(point2.getY() - this.getY());
    return Math.sqrt((dx * dx) + (dy * dy));
  }

}