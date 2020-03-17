package fr.umlv.geom;

import java.util.Objects;

public class Ring extends Circle {

  /*
  2.1. 
  Il est judicieux de faire de l'h�ritage quand la classe fille est une d�finition
  plus pr�cise de la classe mere
   */
  private int inRadius = 0;

  public Ring(Point center, int radius, int inRadius) {
    super(center, radius);
    /*
    2.2.
    Si le rayon interne est sup�rieur au rayon de l'anneau, on lance une Exception
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
  Innutile de coder la m�thode contains(Point p, Ring... rings) gra�e a 
  l'h�ritage et au polymorphisme
   */
}
