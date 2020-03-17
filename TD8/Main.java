
import java.util.HashSet;

// javac *.java && java Main
/**
 * @desc TD8- Main
 * @author Nicolas SENECAL
 */
public class Main {

  public static void main(String[] args) {
    var apple1 = new Apple(20, AppleKind.Golden);
    var apple2 = new Apple(40, AppleKind.PinkLady);
    var pear = new Pear(5);

    var basket = new Basket();
    basket.add(apple1, 5);      // 5 pommes
    basket.add(apple2);
    basket.add(pear, 3);        // 3 poires
    basket.add(pear, 4);        // + 4 poires
    System.out.println(basket);
  }
}
