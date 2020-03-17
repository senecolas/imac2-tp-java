
import java.util.Objects;

enum AppleKind {
  Golden {
    public String toString() {
      return "Golden";
    }
  }, PinkLady {
    public String toString() {
      return "Pink Lady";
    }
  }, GrannySmith {
    public String toString() {
      return "Granny Smith";
    }
  };
}

public class Apple implements Fruit {

  private final int weight;
  private final AppleKind kind;

  public Apple(int w, AppleKind kind) {
    this.weight = w;
    this.kind = Objects.requireNonNull(kind);
  }

  public int price() {
    return this.weight / 2;
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
    Apple other = (Apple) obj;
    if (!this.kind.equals(other.kind)) {
      return false;
    } else if (this.weight != other.weight) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 67 * hash + this.weight;
    hash = 67 * hash + Objects.hashCode(this.kind.toString());
    return hash;
  }

  @Override
  public String toString() {
    return "Apple - " + this.kind + " " + this.weight + "g " + "(" + this.price() + "e) ";
  }
}
