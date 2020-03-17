
/**
 * @desc TD2 - Exercice 2
 * @author Nicolas SENECAL
 */
import java.lang.StringBuilder;

public class Morse {

  public static void main(String[] args) {
    StringBuilder res = new StringBuilder();
    //String res = "";
    for (String arg : args) {
      res.append(arg);
      res.append(" Stop.");
      //res += arg + " Stop. ";
    }
    System.out.println(res);
    
    // 2.
    /*
    java.lang.StringBuilder est comme la classe java.lang.String a l'exception du 
    fait qu'elle est mutable. Là où la classe String va recréer un nouveau objet 
    a chaque concaténation, le StringBuilder va utiliser et modifier/agrandir un 
    seul objet, ce qui est plus efficace si on doit concaténer un grand nombre 
    de chaines.
    */
    
    // 3.
    /* 
    L'avantage par rapport à la solution précédente est que l'on ne créer par un 
    nouveau objet String a chaque concaténation.
    */
    
    // 5.
    /*
    Le bytecode est plus long avec l'utilisation du StringBuilder (55 contre 45)
    Le StringBuilder est donc plus long a mettre en place qu'un simple String, mais
    est "rentable" sur le long terme (plusieurs concaténation)  
    On doit donc utiliser StringBuilder.append() plutôt que le + lorsqu'on doit 
    concaténer un grand nombre de chaines de caractères 
    Il faut éviter d'écrire un + dans un appel à la méthode StringBuilder.append() 
    car on fait la même erreur que sans le StringBuilder : on concatène des objets 
    non mutable
    */
  }
}
