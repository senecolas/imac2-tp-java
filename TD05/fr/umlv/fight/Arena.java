package fr.umlv.fight;

// javac fr/umlv/fight/*.java && java fr/umlv/fight/Arena
// ou javac `Find . -name *.java`
/**
 * @desc TD5 - Arena
 * @author Nicolas SENECAL
 */
public class Arena {

  public static void main(String[] args) {
    // EXERCICE 1
    var d2r2 = new Robot("D2R2");
    System.out.println(d2r2);  // affiche "Robot bob"

    var data = new Robot("Data");
    System.out.println(data);

    Robot winner = fight(d2r2, data);
    System.out.println(winner + " gagne le combat");

    // EXERCICE 2
    /* 
    2.1. 
    Un générateur de nombre aléatoire crée une suite de nombre qui semble aléatoire. 
    Il utilise une graine (seed) pour calculer cette suite.
    Une graine donnera toujours la même suite.
    
    2.3.
    Il ne faut jamais qu'un champ soit déclaré avec une visibilité autre que private ou de package
    car seule la classe doit pouvoir controler la valeur de ses champs pour éviter les erreurs et 
    les déclaration/affectation interdites (exemple: champs a null),
    on doit donc forcer l'utilisation de getter et setter pour accéder aux attributs 
     */
    var john = new Fighter("John", 1);
    var jane = new Fighter("Jane", 2);
    System.out.println(fight(john, jane) + " wins");
    
    /*
    2.9.
    Le sous-typage permet d'heriter des méthodes et attribtus d'une autre classe
    pour éviter le copier-coller et pour faciliter la maintenance du code (faire 
    évoluer le code à un seul endroit)
    
    Le polymorphisme permet de redéfinir une méthode d'une classe hérité pour
    avoir un comportement différent 
    
    */
  }

  public static Robot fight(Robot r1, Robot r2) {
    System.out.println(r1 + " contre " + r2);
    Robot first = r1;
    Robot second = r2;
    Robot tmp;
    while (!r1.isDead() && !r2.isDead()) {
      try {
        first.fire(second);
      } catch (Exception e) {
        break;
      }

      // switch first and second
      tmp = first;
      first = second;
      second = tmp;
    }
    return r1.isDead() ? r2 : r1;
  }
}
