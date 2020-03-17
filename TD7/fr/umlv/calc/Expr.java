package fr.umlv.calc;

import java.util.Scanner;

public interface Expr {

  public int eval();

  public static Expr parse(Scanner scanner) {
    String s = scanner.next();
    switch (s) {
      case ("+"):
        return new Add(parse(scanner), parse(scanner));
      case ("-"):
        return new Sub(parse(scanner), parse(scanner));
      default:
        return new Value(Integer.parseInt(s));
    }
  }
}
