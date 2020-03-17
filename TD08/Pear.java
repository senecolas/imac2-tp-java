
import java.util.Objects;

public class Pear implements Fruit {

  private final int juice;

  public Pear(int juice) {
    assert juice >= 0 && juice <= 9 : "The Juice must be between 0 and 9"; 
    this.juice = juice;
  }

  public int price() {
    return this.juice * 3;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj == null) {
      return false;
    } else if (getClass() != obj.getClass()) {
      return false;
    }
    Pear other = (Pear) obj;
    return this.juice == other.juice;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 29 * hash + this.juice;
    return hash;
  }

  @Override
  public String toString() {
    return "Pear - " + this.juice + "j " + "(" + this.price() + "e) ";
  }
}
