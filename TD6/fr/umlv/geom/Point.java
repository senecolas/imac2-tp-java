package fr.umlv.geom;

/*
1.1.
Le code ne compile pas car x et y sont déclaré en final. Il ne peuvent donc pas
reçevoir une autre valeur dans la fonction translate.
 */
public class Point {

  private /*final*/ int x;
  private /*final*/ int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point p) {
    this.x = p.x;
    this.y = p.y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public double squaredDistance(Point p) {
    double d1 = p.getX() - this.getX();
    double d2 = p.getY() - this.getY();
    d1 = d1 * d1;
    d2 = d2 * d2;
    return d1 + d2;
  }

  public double distance(Point p) {
    return Math.sqrt(this.squaredDistance(p));
  }

  @Override
  public String toString() {
    return "(" + x + ',' + y + ')';
  }

  public void translate(int dx, int dy) {
    x += dx;
    y += dy;
  }
}
