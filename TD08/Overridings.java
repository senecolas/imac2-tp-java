
class A {

  int x = 1;

  public int getX() {
    return x;
  }

  static void printX(A a) {
    System.out.println("in A.printX");
    System.out.println("x " + a.x);
    System.out.println("getX() " + a.getX());
  }

  int m(A a) {
    return 1;
  }
}

class B extends A {

  int x = 2;

  public int getX() {
    return x;
  }

  static void printX(B b) {
    System.out.println("in B.printX");
    System.out.println("x " + b.x);
    System.out.println("getX() " + b.getX());
  }

  int m(B b) {
    return 2;
  }
}

public class Overridings {

  public static void main(String[] args) {
    A.printX(new A());
    /*
    Ce qui devrait �tre affich� :
    in A.printX
    x 1
    getX() 1
    
    Ce qui est affich� :
    idem...
     */

    B.printX(new B());
    /*
    Ce qui devrait �tre affich� :
    in B.printX
    x 2
    getX() 2
    
    Ce qui est affich� :
    idem...
     */

    A.printX(new B());
    /*
    Ce qui devrait �tre affich� :
    in A.printX
    x 2
    getX() 2
    
    Ce qui est affich� :
    in A.printX
    x 1
    getX() 2
     */

    A a = new B();
    System.out.println(a.m(a));
    /*
    Ce qui devrait �tre affich� :
    2
    
    Ce qui est affich� :
    1
     */
  }
}
