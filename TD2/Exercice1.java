
/**
 * @desc TD2 - Exercice 1
 * @author Nicolas SENECAL
 */
public class Exercice1 {

  public static void main(String[] args) {

    // 1.
    var s = "toto";
    /*
    Le type de "s" est "String"
    Le compilateur trouve le bon type de la variable grace a l'inf�rence du type des variables locale
    Nous pouvons donc ensuite utiliser toutes les m�thodes de "String", dont "length"
     */
    System.out.println(s.length());

    // 2.
    var s1 = "toto";
    var s2 = s1;
    var s3 = new String(s1);

    System.out.println(s1 == s2); // affiche "true"
    System.out.println(s1 == s3); // affiche "false"
    /*
    L�op�rateur == (�galit� primitive) teste l��galit� des valeurs ou des r�f�rences
    s2 est une r�f�rence sur s1, donc s1 et s2 sont r�ellement identique (ils pointent sur la m�me donn�e)
    s3 est une copie de s1, s3 est donc stock� dans un autre espace m�moire, s1 et s3 ne sont donc pas r�ellement identique d'un point de vue primitif
     */

    // 3.
    var s4 = "toto";
    var s5 = new String(s4);

    System.out.println(s4.equals(s5)); // comparer le contenue de s4 et s5

    // 4.
    var s6 = "toto";
    var s7 = "toto";

    System.out.println(s6 == s7); // affiche "true" 
    /*
    Les cha�nes de caract�res en java sont optimis� grace a un pool sp�cial, afin de limiter les doublons en m�moire
    si une valeur litt�rale y est directement associ�e, cette derni�re sera automatiquement plac�e dans le pool et la r�f�rence pointera dessus.
    si une nouvelle instance de String est cr��e, la valeur qu'elle repr�sente ne sera pas pool�e.
    (http://thecodersbreakfast.net/index.php?post/2008/02/22/24-comparaison-des-chaines-accentuees-en-java) 
    
    Ici, la valeur litt�rale est d'abord associ�e a s6 et mis dans le pool. 
    Ensuite, ont associe une valeur litt�rale identique a s6 dans s7, 
    cette valeur existant deja dans le pool, on pointe directement dessus pour 
    �viter les doublons d'espaces m�moire.
     */

    // 5.
    /*
    java.lang.String est non mutable (les instances ne peuvent �tre modifi�) car s'il l'�tait et que nous avions deux m�me r�f�rences cr��s 
    automatiquement par le String Pool, modifi� l'un reviendrais a modifier l'autre et entrainer des erreurs 
     */
    
    // 6.
    var s8 = "hello";
    s8.toUpperCase();
    System.out.println(s8); // affiche "hello"
    System.out.println(s8.toUpperCase()); // affiche "HELLO"
    /*
    La m�thode toUpperCase() de la classe java.lang.String ne modifie pas la chaine de caract�re actuelle
    mais en renvoie une nouvelle
    */
  }
}
