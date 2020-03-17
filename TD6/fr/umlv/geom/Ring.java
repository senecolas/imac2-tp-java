package fr.umlv.geom;

import java.util.Objects;

public class Ring extends Circle {

  /*
  2.1. 
  Il est judicieux de faire de l'héritage quand la classe fille est une définition
  plus précise de la classe mere
   */
  private int inRadius = 0;

  public Ring(Point center, int radius, int inRadius) {
    super(center, radius);
    /*
    2.2.
    Si le rayon interne est supérieur au rayon de l'anneau, on lance une Exception
     */
    if (inRadius >= radius) {
      throw new RuntimeException("The inner radius must be smaller than the radius of the ring");
    }
    this.inRadius = inRadius;
  }

  @Override
  public String toString() {
    return super.toString() + " ; InternalRadius = " + inRadius;
  }

  public boolean contains(Point p) {
    Circle interior = new Circle(getCenter(), inRadius);
    return super.contains(p) && !interior.contains(p);
  }

  /*
  3.2.
  Innutile de coder la méthode contains(Point p, Ring... rings) graçe a 
  l'héritage et au polymorphisme
   */
}
