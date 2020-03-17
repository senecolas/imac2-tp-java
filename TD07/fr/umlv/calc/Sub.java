package fr.umlv.calc;

import java.util.Objects;

import java.util.Scanner;

public class Sub implements Expr {

  private final Expr left;
  private final Expr right;

  public Sub(Expr left, Expr right) {
    this.left = Objects.requireNonNull(left, "Invalid left value");
    this.right = Objects.requireNonNull(right, "Invalid left value");
  }

  public int eval() {
    return left.eval() - right.eval();
  }

  public static Sub parse(Scanner scanner) {
    return (Sub) Expr.parse(scanner);
  }

  @Override
  public String toString() {
    return left.toString() + " - " + right.toString();
  }
}
