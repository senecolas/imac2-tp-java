
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @desc TD3 - Main
 * @author Nicolas SENECAL
 */
public class Main {

  public static void main(String[] args) {
    // EXERCICE 1
    /*
    # var book = new Book();
    # System.out.println(book.title + ' ' + book.author);
    
    1.3.
    "error: title has private access in Book"
    "error: author has private access in Book"
    Les attributs title et author sont privés, ils ne sont accessible que depuis 
    la classe Book. Pour corriger ce problème, nous devons passer ces attributs
    en public (déconseillé), définir des méthodes de getter/accesseur (getTitle()) ou
    définir une méthode d'affichage
    
    1.4.
    Les 4 visibilités possibles en Java sont :
    – private : accessible uniquement depuis l'intérieur de la classe 
    – Par défaut(pas de modificateur) : accessible depuis toutes les classes qui sont 
      dans le même paquetage
    - protected : accessible depuis toutes les classes qui sont dans le même paquetage que A, 
      et également depuis celles qui ne sont pas dans le même paquetage mais qui 
      héritent de la classe
    – public : accessible depuis n'importe où
    
    On déclare généralement les champs en privés pour respecter le principe d'encapsulation 
    - Chaque objet et responsables de ses attributs 
    - Le code a modifier ou faire évoluer est localisé dans l'objet 
    
    1.5. 
    Un accesseur est une méthode permettant de consulter ou de modifier une propriété d’un objet 
    Les accesseurs que l'on doit mettre ici sont donc les getters getTitle() et getAuthor()
    
    1.6.
    Pour indiquer à un futur développeur que la valeur d'un champs ne doit pas être modifiée,
    il faut le déclarer en "final" ("private final String author")
    Cela permet de vérifier qu'un champs qui ne doit pas être modifier (exemple, un identifiant)
    n'a été affecté qu'une seule fois et ne peut plus être modifié
    
    1.7. 
    Le code ci-dessus ne fonctionne plus car le constructeur prend désormais 2 paramétres 
     */

    var book = new Book("myTitle", "myAuthor");

    /*
    1.8.
    Si on modifie le constructeur pour que les deux paramètres s'appellent title et author,
    nous avons un conflit de nom : nous ne pouvons distinguer les attributs des paramétres. 
    Pour régler ce conflit nous pouvons utiliser le mots clef 'this'.
    
    1.10.
    Le compilateur sait quel constructeur appeller en regardant le nombre et les types
    des variables passés en paramétres 
    
    1.11.
    Pour que le second constructeur appelle le premier il faut utiliser "this(...)"
     */
    // EXERCICE 2
    var b1 = new Book("Da Java Code", "Duke Brown");
    var b2 = b1;
    var b3 = new Book("Da Java Code", "Duke Brown");

    System.out.println(b1 == b2); // affiche "true"
    System.out.println(b1 == b3); // affiche "false"
    /*
    2.1. 
    b1 et b2 ont la même référence (ils pointent tout les deux sur la même donnée)
    mais b3 est une autre références sur des données similaires mais a un autre endroits
    Le o1 == o2 test uniquement les références des objets et non leurs contenus 
    
    2.3.
    La méthode indexOf de java.util.ArrayList envoi la première occurence d'un élément spécifié dans la liste ou -1 s'il ne la trouve pas
     */

    var list = new ArrayList();
    list.add(b1);
    System.out.println(list.indexOf(b2)); // affiche "0"
    System.out.println(list.indexOf(b3)); // affiche "0"

    /*
    2.4. 
    indexOf confond b2 et b3
    
    2.5.
    ArrayList.indexOf appel la méthode equals de Book
    
    2.8.
    @Override sert à définir explicitement que l'on redéfinit une méthode : 
    permet au compilateur de signaler une erreur si la signature de la méthode 
    n'est pas identique à une méthode existante
     */
    // var aBook = new Book(null, null);
    // var anotherBook = new Book(null, null);
    // list.add(aBook);
    // System.out.println(list.indexOf(anotherBook));
    /*
    2.9.
    "
    Exception in thread "main" java.lang.NullPointerException
        at Book.equals(Book.java:42)
        at java.base/java.util.ArrayList.indexOfRange(ArrayList.java:330)
        at java.base/java.util.ArrayList.indexOf(ArrayList.java:317)
        at Main.main(Main.java:104)
    "
    L'erreur NullPointerException se trouve dans la fonction "equals" de Book car 
    nous essayons d'utiliser la méthode "equals" sur un objet null ("null.equals(...)")
    
    Un code doit arrêter de fonctionner si celui-ci est mal utilisé par un développeur
    pour prévenir des erreurs qui peuvent fausser le résultat du programme
    
    Pour corriger l'erreur, il nous pouvons tester si l'objet est nul et interrompre 
    la fonction dans ce cas ("if (var == null) return") => déconseillé/mauvaise pratique
    ou voir 2.10.
    
    2.10.
    La règle de bonne pratique concernant l'utilisation de "null" est d'interdire 
    l'affectation de "null" aux attributs d'un objet lors de sa création : On vérifie 
    à la création (et dans les setters) avec java.util.Objects.requireNonNull()
    Exception : si nous utilisons "null" pour indiquer "pas d'élément". Dans ce cas
    il faut le préciser dans la documentation et dans le commentaire du code
    
    
    2.11.
    La méthode java.util.Objects.requireNonNull permet de vérifier que l'objet 
    spécifié est non null (lance une erreur sinon)
    ici : this.title = Objects.requireNonNull(title, "Title can not be null");
     */
    // EXERCICE 3
    var b5 = new Book("Da Java Code", "Dan Duke");
    var b6 = new Book("Book with no author");
    System.out.println(b5);
    System.out.println(b6);
    /*
    3.2.
    On peut utiliser l'annotation @Override ici car une fonction toString existe 
    par défaut dans chaque objet
     */

    // EXERCICE 4
    
    int[] tab = {3, 6, 4, 2, 5, 7, 0, 8, 1, 9};
    System.out.println("\ntab = " + Arrays.toString(tab));
    System.out.println("Swap index 2 and 6...");
    swap(tab, 2, 6);
    System.out.println("tab = " + Arrays.toString(tab));
    System.out.println("Index of min = " + indexOfMin(tab, 0, tab.length));
    System.out.println("Sort array...");
    sort(tab);
    System.out.println("tab = " + Arrays.toString(tab));

  }

  public static void swap(int[] tab, int idx1, int idx2) {
    if (idx1 > tab.length || idx2 > tab.length) {
      System.out.println("ERROR : index out of range");
      return;
    }
    int tmp = tab[idx1];
    tab[idx1] = tab[idx2];
    tab[idx2] = tmp;
  }

  public static int indexOfMin(int[] tab, int idxMin, int idxMax) {
    if (idxMin > tab.length || idxMax > tab.length) {
      System.out.println("ERROR : index out of range");
      return -1;
    }
    int res = -1;
    int min = Integer.MAX_VALUE;
    for (int i = idxMin; i < idxMax; i++) {
      if (min > tab[i]) {
        min = tab[i];
        res = i;
      }
    }
    return res;
  }

  public static void sort(int[] tab) {
    for (int i = 0; i < tab.length; i++) {
      int idxMin = indexOfMin(tab, i, tab.length);
      if (idxMin != i) {
        swap(tab, i, idxMin);
      }
    }
  }

}
