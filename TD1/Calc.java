/**
 * @desc Simple program that display the results of all mathematical operations between two numbers.
 * @author Nicolas SENECAL
 */
import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {

    // Scanner
    Scanner scanner = new Scanner(System.in);// variable de type Scanner 

    // Get value1 and value2
    System.out.println("Entrez le premier nombre :");
    int value1 = scanner.nextInt(); // variable de type int
    System.out.println("Entrez le deuxieme nombre :");
    int value2 = scanner.nextInt(); // variable de type int

    // Calculator
    System.out.println("\n");
    System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
    System.out.println(value1 + " - " + value2 + " = " + (value1 - value2));
    System.out.println(value1 + " * " + value2 + " = " + (value1 * value2));
    System.out.println(value1 + " / " + value2 + " = " + (value1 / value2));
    System.out.println(value1 + " % " + value2 + " = " + (value1 % value2));

    // End of Scanner
    scanner.close();
  }
}

/*
  3. "nextInt()" n'est pas une fonction, c'est une méthode de la classe "Scanner"
  4. "import java.util.Scanner;" on n'importe la classe "Scanner" de la librairie "util" de java
 */
