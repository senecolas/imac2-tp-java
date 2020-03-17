package fr.umlv.calc;

public class Value implements Expr {

  private final int value;

  public Value(int value) {
    this.value = value;
  }

  public int eval() {
    return value;
  }

  @Override
  public String toString() {
    return Integer.toString(value);
  }
}
