package TD4;

public class ArrayShoppingCartTest {
	
	public static void main(String[] args) {
		// 1.
		ArrayShoppingCart cart1 = new ArrayShoppingCart(3);
		try {
			cart1.add(new Book("Orgueil et préjugés"));
			cart1.add(new Book("Les Hauts de Hurle-Vent"));
			cart1.add(new Book("Hamlet"));
			cart1.add(new Book("L'Étranger"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(cart1);
		System.out.println("Le livre avec le titre le plus long est \"" + cart1.longestTitle() + "\"");
		
		
		// 2.
		FreeShoppingCart cart2 = new FreeShoppingCart();
		cart2.add(new Book("Orgueil et préjugés"));
		cart2.add(new Book("Les Hauts de Hurle-Vent"));
		cart2.add(new Book("Hamlet"));
		cart2.add(new Book("L'Étranger"));
		
		// foreach sur collection 
		System.out.println("Le livre avec le titre le plus long est \"" + cart2.longestTitle() + "\"");
		
		// foreach sur tableau
		for(String arg : args) {
			System.out.println(arg);
		}
		// 3.4. Un foreach sur une collection est plus optimisé que sur un simple tableau

		
		
	}
}
