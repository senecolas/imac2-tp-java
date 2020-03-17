package fr.umlv.geom;

import java.util.Objects;

public class Circle {

  private Point center; // 2.1. Can not be null 
  private int radius;

  public Circle(Point center, int radius) {
    this.center = new Point(Objects.requireNonNull(center, "The center's point can not be null"));
    this.radius = radius;
  }

  public Point getCenter() {
    return new Point(center);
  }

  public double surface() {
    return Math.PI * this.radius * this.radius;
  }

  public boolean contains(Point p) {
    return this.getCenter().squaredDistance(p) <= this.radius * this.radius;
  }

  @Override
  public String toString() {
    return "center = " + center.toString() + " ; radius = " + radius + " ; surface = " + surface();
  }

  public void translate(int dx, int dy) {
    center.translate(dx, dy);
  }

  /*
  1.10.
  "..." dans la signature de la méthode veut dire que l'on peut passer a la fin des
  parametres autant de Circle que l'on veut et qu'ils seront tous contenus dans le tableau
  circles. (voir "varargs")
   */
  static boolean contains(Point p, Circle... circles) {
    for (Circle c : circles) {
      if (c.contains(p)) {
        return true;
      }
    }
    return false;
  }
}
