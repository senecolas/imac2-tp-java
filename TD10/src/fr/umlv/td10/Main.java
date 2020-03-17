package fr.umlv.td10;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.function.LongSupplier;

// javac src/fr/umlv/td10/*.java -d classes 
// java -cp classes fr.umlv.td10.Main
/**
 * @desc TD10 - Main
 * @author Nicolas SENECAL
 */
public class Main {

  public static void main(String[] args) {

    // 1.1
    var list = List.of("hello", "world", "hello", "lambda");
    System.out.println("count : " + count(list, "hello"));  // 2

    // 1.2
    System.out.println("count2 : " + count2(list, "hello"));  // 2

    // 2
    System.out.println("upperCase  : " + upperCase(list)); // [HELLO, WORLD, HELLO, LAMBDA]
    System.out.println("upperCase2 : " + upperCase2(list)); // [HELLO, WORLD, HELLO, LAMBDA]
    System.out.println("upperCase3 : " + upperCase2(list)); // [HELLO, WORLD, HELLO, LAMBDA]
    System.out.println("upperCase4 : " + upperCase2(list)); // [HELLO, WORLD, HELLO, LAMBDA]

    // 3
    System.out.println("count3 : " + count2(list, "hello"));  // 2

    // 4
    var list2 = new Random(0)
            .ints(1_000_000, 0, 100)
            .mapToObj(Integer::toString)
            .collect(Collectors.toList());
    // 4.1 list2 contient 1000000 d'entiers de 0 à 100
    System.out.println("count");
    printAndTime(() -> count(list2, "33"));
    System.out.println("count2");
    printAndTime(() -> count2(list2, "33"));
    System.out.println("count3");
    printAndTime(() -> count3(list2, "33"));
    /*
    Le plus rapide est le count2 car nous parcourons une fois la liste avec 
    .filter(), ensuite nous utilisons la méthode .count() qui va simplement lire 
    l'attribut "size" de la liste.
    
    Le 2eme est count3 car nous faisons 3 parcours de liste (un filtre sur la 
    totalité, puis une map et un reduce sur le tableau résultant.
    
    Le plus lent est count car nous parcours la liste avec une boucle for 
    (surement moins optimisé que les filtres).
    */
  }

  private static void printAndTime(LongSupplier sup) {
    long start = System.nanoTime();
    long result = sup.getAsLong();
    long end = System.nanoTime();
    System.out.println("  - result = " + result);
    System.out.println("  - elapsed time = " + (end - start));
  }

  private static long count(List<String> list, String string) {
    long count = 0;
    for (String str : list) {
      if (string.equals(str)) {
        count += 1;
      }
    }
    return count;
  }

  private static long count2(List<String> list, String string) {
    /*
    1.2.1 
    Pour obtenir un Stream à partir d'un objet de type List il faut utiliser 
    la méthode .stream()
    
    1.2.2
    Pour filtrer un stream on utilise la méthode .filter()
    Pour compter le nombre d'éléments on utilise .count()
     */
    return list.stream().filter(str -> string.equals(str)).count();
  }

  private static long count3(List<String> list, String string) {
    /*
    3.1
    La méthode reduce retourne un Long, c'est pourquoi nous n'allons pas 
    utiliser la méthode map mais la méthode mapToLong
     */
    return list.stream()
            .filter(str -> string.equals(str))
            .mapToLong(str -> 1)
            .reduce(0, Long::sum);
  }

  private static List<String> upperCase(List<String> list) {
    List<String> newList = new ArrayList<>();
    for (String str : list) {
      newList.add(str.toUpperCase());
    }
    return newList;
  }

  private static List<String> upperCase2(List<String> list) {
    List<String> newList = new ArrayList<>();
    list.stream().map(str -> str.toUpperCase()).forEach(str -> newList.add(str));
    return newList;
  }

  private static List<String> upperCase3(List<String> list) {
    List<String> newList = new ArrayList<>();
    list.stream()
            .map(String::toUpperCase)
            .forEach(str -> newList.add(str));
    return newList;
  }

  private static List<String> upperCase4(List<String> list) {
    return list.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
  }
}
