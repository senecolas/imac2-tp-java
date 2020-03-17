
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
    Le compilateur trouve le bon type de la variable grace a l'inférence du type des variables locale
    Nous pouvons donc ensuite utiliser toutes les méthodes de "String", dont "length"
     */
    System.out.println(s.length());

    // 2.
    var s1 = "toto";
    var s2 = s1;
    var s3 = new String(s1);

    System.out.println(s1 == s2); // affiche "true"
    System.out.println(s1 == s3); // affiche "false"
    /*
    L’opérateur == (égalité primitive) teste l’égalité des valeurs ou des références
    s2 est une référence sur s1, donc s1 et s2 sont réellement identique (ils pointent sur la même donnée)
    s3 est une copie de s1, s3 est donc stocké dans un autre espace mémoire, s1 et s3 ne sont donc pas réellement identique d'un point de vue primitif
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
    Les chaînes de caractères en java sont optimisé grace a un pool spécial, afin de limiter les doublons en mémoire
    si une valeur littérale y est directement associée, cette dernière sera automatiquement placée dans le pool et la référence pointera dessus.
    si une nouvelle instance de String est créée, la valeur qu'elle représente ne sera pas poolée.
    (http://thecodersbreakfast.net/index.php?post/2008/02/22/24-comparaison-des-chaines-accentuees-en-java) 
    
    Ici, la valeur littérale est d'abord associée a s6 et mis dans le pool. 
    Ensuite, ont associe une valeur littérale identique a s6 dans s7, 
    cette valeur existant deja dans le pool, on pointe directement dessus pour 
    éviter les doublons d'espaces mémoire.
     */

    // 5.
    /*
    java.lang.String est non mutable (les instances ne peuvent être modifié) car s'il l'était et que nous avions deux même références créés 
    automatiquement par le String Pool, modifié l'un reviendrais a modifier l'autre et entrainer des erreurs 
     */
    
    // 6.
    var s8 = "hello";
    s8.toUpperCase();
    System.out.println(s8); // affiche "hello"
    System.out.println(s8.toUpperCase()); // affiche "HELLO"
    /*
    La méthode toUpperCase() de la classe java.lang.String ne modifie pas la chaine de caractère actuelle
    mais en renvoie une nouvelle
    */
  }
}
