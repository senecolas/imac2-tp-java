package TD4;

import java.util.Objects;

/**
 * @desc Simple program that says "Hello Eclipse"
 * @author Nicolas SENECAL
 */

//5. Alt + shift + R => refactor
public class Main {
	
	// 10. Ctrl + Shift + G recherche tous les endroits ou "foo" apparait 
	int foo;
	
	// 3.
	public int getFoo() {
		return foo;
	}
	
	// 3.
	public void setFoo(int foo) {
		this.foo = foo;
	}
	
	// 4. Source > Generate Constructor using field > "foo"
	public Main(int foo) {
		super();
		this.foo = foo;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Eclipse");
    
		// 1. System.out.println();
		// 2. ToStream

		// 6.
		int i = 2 + 3;
		int a = i + 4;
		
		// 7. 
		@SuppressWarnings("deprecation")
		Integer integer = new Integer(2);
		
		// 8. Appuyer sur string en maintenant Ctrl ouvre la déclaration de String
		String s; 
		
		// 11. Ctrl+Shift+0 sert a trouver et insérer les packages manquant 
    
	}



}
