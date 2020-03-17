/**
 * @desc Simple program that display the sum of integers taken as parameters on the command line.
 * @author Nicolas SENECAL
 */
import java.lang.Integer;
import java.util.Arrays;

public class Sum {

  public static void main(String[] args) {
    int[] integers = stringTabToIntTab(args);
    System.out.println("integers: " + Arrays.toString(integers));
    System.out.println("sum: " + sumInts(integers));
  }

  /**
   * @desc Takes an array of strings as an argument and returns an array of
   * integers of the same size containing the integers from strings.
   * @param tab The string array
   * @return The int array
   */
  public static int[] stringTabToIntTab(String[] tab) {
    int[] res = new int[tab.length];
    for (int i = 0; i < tab.length; i++) {
      res[i] = Integer.parseInt(tab[i]);
    }
    return res;
  }

  /**
   * @desc Returns the sum of an integer array
   * @param tab The int array
   * @return The sum
   */
  public static int sumInts(int[] tab) {
    int res = 0;
    for (int nb : tab) {
      res += nb;
    }
    return res;
  }
}

/*
  2. Une méthode statique est une méthode qui peut être appelée sans initialisation d'instance de la classe
  3. Lorsqu'un mot pris en argument n'est pas un nombre, la méthode parseInt retourne une erreur
 */
