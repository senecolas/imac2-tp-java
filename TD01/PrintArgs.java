/**
 * @desc Simple program that displays the command line arguments.
 * @author Nicolas SENECAL
 */
public class PrintArgs {

  public static void main(String[] args) {
    /*
    System.out.println(args[0]); // afficher uniquement le premier argument
    Si nous ne passons pas d'argument, nous avons une erreur a la ligne du println
    "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at PrintArgs.main(PrintArgs.java:8)"
     */

    for (String arg : args) {
      System.out.println(arg);
    }
  }
}
