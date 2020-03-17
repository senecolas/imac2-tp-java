package fr.umlv.geom;

// javac fr/umlv/geom/*.java && java fr/umlv/geom/Main
/**
 * @desc TD6 - Main
 * @author Nicolas SENECAL
 */
public class Main {

  public static void main(String[] args) {

    /*
    var point = new Point(1, 2);
    var circle = new Circle(point, 1);

    var circle2 = new Circle(point, 2);
    circle2.translate(1, 1);

    System.out.println(circle + " " + circle2);
    
    1.6. 
    "[(2,3) ; 1] [(2,3) ; 2]"
    Les deux cercles (circle at circle2) partagent le même point, donc un déplacement sur l'un 
    implique un déplacement sur l'autre. 
    Pour éviter celà il faut faire une copie du point dans le constructeur du cercle
    
    1.7.
    Avec un getCenter codé simplement avec un "return center;", si nous modifions 
    ou déplaçons le point récupéré, nous modifions également la position du cercle
    ce qui peut entrainer des erreurs de développements.
    Pour que le code soit correct, nous devons envoyer une copie du point.
     */
    var point = new Point(1, 2);
    var circle3 = new Circle(point, 2);
    System.out.println(circle3);
    var ring = new Ring(point, 2, 1);
    System.out.println(ring);

    System.out.println(Circle.contains(point, ring));

    /*
    3.3.
    - L'Héritage permet d'éviter de recopier du code 
    - Il faut faire attention à la mutabilité quand une classe en contient une autre (ex: la classe Point)
    - Utiliser un maximum super en redéfinition si possible pour éviter de recopier du code
    - "varargs" ("..." dans les parametres) permet de passer autant d'arguments que l'on veut 
    - Math.pow(a,2) est 2 fois plus long que a*a
    - Math.sqrt(a+b) est plus long qu'utiliser les égalités au carré
     */
  }
}
