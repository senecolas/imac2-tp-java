
import java.util.ArrayList;

public class Basket {

  private final ArrayList<FruitQuantity> fruits;

  public Basket() {
    this.fruits = new ArrayList<FruitQuantity>();
  }

  public void add(Fruit fruit) {
    this.add(fruit, 1);
  }

  public void add(Fruit fruit, int n) {
    FruitQuantity fruitQtt = this.getFruitQualtity(fruit);
    if (fruitQtt == null) {
      fruitQtt = new FruitQuantity(fruit, n);
      this.fruits.add(fruitQtt);
    } else {
      fruitQtt.addQuantity(n);
    }
  }

  private FruitQuantity getFruitQualtity(Fruit fruit) {
    for (FruitQuantity fruitQtt : fruits) {
      if (fruitQtt.getFruit().equals(fruit)) {
        return fruitQtt;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    int total = 0;
    for (FruitQuantity fruitQtt : fruits) {
      str.append(fruitQtt.toString());
      str.append("\n");
      total += fruitQtt.price();
    }
    str.append("price : ").append(total);
    return str.toString();
  }
}
