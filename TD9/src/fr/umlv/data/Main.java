package fr.umlv.data;

// javac src/fr/umlv/data/*.java -d classes 
// java -cp classes fr.umlv.data.Main
/**
 * @desc TD7 - Main
 * @author Nicolas SENECAL
 */
public class Main {

  public static void main(String[] args) {
    // Exercice 1 
    /*
    1.1. La classe Link doit �tre de visibilit� de package car seule les classes 
    de fr.umlv.data sont autoris�e a directement manipuler les maillons (idem pour 
    les attributs)
    
    1.2. javac src/fr/umlv/data/*.java -d classes && java -cp classes fr.umlv.data.Main
     */

    LinkedLink<Integer> l1 = new LinkedLink<>();
    l1.add(5);
    l1.add(12);
    l1.add(23);
    l1.add(14);
    System.out.println(l1);

    // Exercice 2
    System.out.println(l1.get(1));
    LinkedLink<String> l2 = new LinkedLink<>();
    l2.add("amet");
    l2.add("sit");
    l2.add("dolor");
    l2.add("ipsum");
    l2.add("Lorem");
    System.out.println(l2);
    System.out.println("Size of the third element : " + ((String) l2.get(2)).length());

    /*
    2.4. On est oblig� d'ajouter un cast car length est une m�thode de String, 
    or un Object n'en est pas forcement un. 
    En tant que d�veloppeur Java, on n'aime pas les casts car cela peut aboutir 
    � une erreur de type.
     */
    
    // Exercice 3
    /*
    3.1. Un type param�tr� nous permettrais ici d'utiliser LinkedLink avec 
    un type impos� et non juste avec des Objects ou avec une classe par type
    (LinkedLinkInt, LinkedLinkString...), ce qui permettrais d'�viter un cast 
    lorsque l'on veut utiliser un element de la liste
    */
    System.out.println("Size of the 4th element : " + l2.get(3).length());
    System.out.println("l2 contains \"amet\" ? " + l2.contains("amet"));
    System.out.println("l2 contains \"coucou\" ? " + l2.contains("coucou"));
    /*
    3.4. contains prend un Object en param�tre et pas un T car l'objet que l'on
    veut comparer n'est pas forc�ment exactement de type T. Il peut �tre 
    compl�tement diff�rents (contains renverras toujours false) ou alors il peut 
    �tre dans l'h�ritage de T (classe fille ou m�re avec une red�finition de 
    equals)
    */
  }
}
