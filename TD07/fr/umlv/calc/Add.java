package fr.umlv.calc;

import java.util.Objects;

import java.util.Scanner;

public class Add implements Expr {

  private final Expr left;
  private final Expr right;

  public Add(Expr left, Expr right) {
    this.left = Objects.requireNonNull(left, "Invalid left value");
    this.right = Objects.requireNonNull(right, "Invalid left value");
  }
  
  @Override
  public int eval() {
    return left.eval() + right.eval();
  }
  
  public static Add parse(Scanner scanner) {
    return (Add) Expr.parse(scanner);
  }

  @Override
  public String toString() {
    return left.toString() + " + " + right.toString();
  }
}
