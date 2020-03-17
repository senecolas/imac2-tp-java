
public class Pascal {

  public static void main(String[] args) {
    System.out.println("Cn, p =" + pascal(30000, 250));
  }

  public static int pascal(int nBut, int pBut) {
    int[] tab = new int[nBut + 1];
    int n, i;

    tab[0] = 1;

    for (n = 1; n <= nBut; n++) {
      tab[n] = 1;

      for (i = n - 1; i > 0; i--) {
        tab[i] = tab[i - 1] + tab[i];
      }
    }

    int result = tab[pBut];
    return result;
  }

}

/*
Programme en C : 
>time a.out
real : 0m1,047s
user : 0m1,045s
sys : 0m0,000s


Programme en Java :
>time java Pascal
real : 0m0,273s
user : 0m0,292s
sys : 0m0,012s


Java est 3fois plus rapide que le C pour ce programme
La diff�rence est due au systeme JIT de Java
*/
