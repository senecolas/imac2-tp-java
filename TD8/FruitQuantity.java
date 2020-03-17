
import java.util.Objects;

/*
2.5.
La classe FruitQuantity ne doit pas être déclarée "public" car nous voulons qu'elle soit
utilisé seulement par le package courant. Elle ne doit pas être instancié ailleur.
 */
class FruitQuantity {

  private final Fruit fruit;
  private int quantity;

  public FruitQuantity(Fruit fruit, int quantity) {
    this.fruit = Objects.requireNonNull(fruit);
    this.quantity = quantity;
  }

  public FruitQuantity(Fruit fruit) {
    this(fruit, 1);
  }

  public Fruit getFruit() {
    return fruit;
  }

  public void addQuantity(int n) {
    this.quantity += n;
  }

  public int price() {
    return this.fruit.price() * this.quantity;
  }

  @Override
  public String toString() {
    return this.fruit.toString() + "x" + this.quantity;
  }
}
