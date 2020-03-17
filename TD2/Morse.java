
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
    fait qu'elle est mutable. L� o� la classe String va recr�er un nouveau objet 
    a chaque concat�nation, le StringBuilder va utiliser et modifier/agrandir un 
    seul objet, ce qui est plus efficace si on doit concat�ner un grand nombre 
    de chaines.
    */
    
    // 3.
    /* 
    L'avantage par rapport � la solution pr�c�dente est que l'on ne cr�er par un 
    nouveau objet String a chaque concat�nation.
    */
    
    // 5.
    /*
    Le bytecode est plus long avec l'utilisation du StringBuilder (55 contre 45)
    Le StringBuilder est donc plus long a mettre en place qu'un simple String, mais
    est "rentable" sur le long terme (plusieurs concat�nation)  
    On doit donc utiliser StringBuilder.append() plut�t que le + lorsqu'on doit 
    concat�ner un grand nombre de chaines de caract�res 
    Il faut �viter d'�crire un + dans un appel � la m�thode StringBuilder.append() 
    car on fait la m�me erreur que sans le StringBuilder : on concat�ne des objets 
    non mutable
    */
  }
}
