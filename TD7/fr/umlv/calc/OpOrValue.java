package fr.umlv.calc;

import java.util.Objects;
import java.util.Scanner;

public class OpOrValue {

  public static final int OP_NONE = 0;
  public static final int OP_ADD = 1;
  public static final int OP_SUB = 2;

  private final int operator;
  private final int value;
  private final OpOrValue left;
  private final OpOrValue right;

  private OpOrValue(int operator, int value, OpOrValue left, OpOrValue right) {
    this.operator = operator;
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public OpOrValue(int value) {
    this(OP_NONE, value, null, null);
  }

  public OpOrValue(int operator, OpOrValue left, OpOrValue right) throws RuntimeException {
    this(operator, 0, Objects.requireNonNull(left, "Invalid left value"), Objects.requireNonNull(right, "Invalid left value"));
    if (operator < OP_NONE || operator > OP_SUB) {
      throw new RuntimeException("Invalid operator");
    }
  }

  public int eval() {
    switch (operator) {
      case OP_ADD:
        return left.eval() + right.eval();
      case OP_SUB:
        return left.eval() - right.eval();
      default: // case OP_NONE:
        return value;
    }
  }

  public static OpOrValue parse(Scanner scanner) {
    if (!scanner.hasNext()) {
      throw new RuntimeException("Invalid scanner");
    }
    String s = scanner.next();
    switch (s) {
      case ("+"):
        return new OpOrValue(OP_ADD, parse(scanner), parse(scanner));
      case ("-"):
        return new OpOrValue(OP_SUB, parse(scanner), parse(scanner));
      default:
          return new OpOrValue(Integer.parseInt(s)); 
    }
  }

  public static void main(String[] args) throws Exception {
    OpOrValue expression = new OpOrValue(OP_ADD,
            new OpOrValue(2),
            new OpOrValue(3)
    );
    System.out.println(expression.eval());
  }

  @Override
  public String toString() {
    switch (operator) {
      case OP_ADD:
        return left.toString() + " + " + right.toString();
      case OP_SUB:
        return left.toString() + " - " + right.toString();
      default:
        return Integer.toString(value);
    }
  }
}
