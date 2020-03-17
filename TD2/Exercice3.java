
/**
 * @desc TD2 - Exercice 3
 * @author Nicolas SENECAL
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercice3 {

  public static void main(String[] args) {

    // 1.
    /*
    java.util.regex.Pattern permet d'encapsule une expression régulière donnée (une chaîne de caractères écrite dans une syntaxe particulière)
    en compliant l'expression fournie avec sa méthode "compile". 
    java.util.regex.Matcher permet de comparer une expression régulière à un texte, et de faire différentes opérations dessus. 
     */
    Pattern numberPattern = Pattern.compile("\\d+"); // ou "[0-9]" ou "\\d" si l'on veut uniquement les caractères compris entre '0' et '9'. 
    Matcher numberMatches;

    System.out.print("Numbers : ");
    for (String arg : args) {
      numberMatches = numberPattern.matcher(arg);
      if (numberMatches.matches()) {
        System.out.print(arg + " ");
      }
    }

    System.out.println();

    System.out.print("Numbers (+inside strings) : ");
    for (String arg : args) {
      numberMatches = numberPattern.matcher(arg);
      while (numberMatches.find()) {
        System.out.print(numberMatches.group());
      }
      System.out.print(" ");
    }

    System.out.println();

    System.out.println("IPv4 : ");
    for (String arg : args) {
      if (Exercice3.isIPv4(arg)) {
        System.out.print(arg);
      }
    }

  }

  /**
   * Test if a string is an IPv4 address
   * @param s The string to test
   * @return True if is an IPv4 adress or false otherwise
   */
  public static boolean isIPv4(String s) {
    Pattern pattern = Pattern.compile("^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$");
    Matcher matches = pattern.matcher(s);
    if (!matches.matches()) {
      return false;
    }
    if (matches.groupCount() != 4) {
      return false;
    }
    for (int i = 1; i <= matches.groupCount(); i++) {
      if (Integer.parseInt(matches.group(i)) > 255) {
        return false;
      }
    }
    return true;
  }
}
