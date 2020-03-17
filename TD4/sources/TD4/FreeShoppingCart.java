package TD4;

import java.util.ArrayList;
import java.util.Iterator;

public class FreeShoppingCart {
	
	ArrayList<Book> books;
	
	public FreeShoppingCart() {
		super();
		this.books = new ArrayList<Book>();
		// 3.1. Pour enlever le warning que le compilateur signale sur la méthode ArrayList.add
		//	  Il faut ajouter préciser le type en template <Book>
	}

	public void add(Book b) {
		this.books.add(b);
	}
	
	public Book longestTitle_get() {
			
			int longest = 0;
			Book b = null;
			
			// 3.2.
			for (int i=0; i<this.books.size(); i++) {
				if (this.books.get(i).getTitle().length() > longest) {
					longest = this.books.get(i).getTitle().length();
					b = this.books.get(i);
				}
			}
			
			return b;
	}
	

	public Book longestTitle_it() {
			
			int longest = 0;
			Book b = null;
			
			// 3.3.
			Iterator<Book> it = this.books.iterator();
			while(it.hasNext()) {
				Book tmp = it.next();
				if (tmp.getTitle().length() > longest) {
					longest = tmp.getTitle().length();
					b = tmp;
				}
			}
			
			return b;
	}
	
	public Book longestTitle() {
		
		int longest = 0;
		Book b = null;
		
		// 3.4.
		for(Book tmp : this.books) {
			if (tmp.getTitle().length() > longest) {
				longest = tmp.getTitle().length();
				b = tmp;
			}
		}
		return b;
	}
	
	public void removeFirstOccurence(Book b) {
		// 5. Dans le pire cas, la complexité est en O(n) (le livre est a la fin du tableau) 
		for(int i=0 ; i < this.books.size() ; i++) {
			if(this.books.get(i).equals(b)) {
				this.books.remove(i);
				return;
			}
		}
	}
	
	public void removeFirstOccurence_it(Book b) {
		// 6.
		Iterator<Book> it = this.books.iterator();
		while(it.hasNext()) {
			Book tmp = it.next();
			if(tmp.equals(b)) {
				it.remove();
				return;
			}
		}
		
	}
	
	// 7. on utilise la boucle foreach quand on a pas besoin de modifier la collection (ajout ou supression) 
	//	  et on utilise un itérateur si on doit la modifier
	//    N.B. nous pouvons utiliser directement "this.books.remove(book)" qui utilise aussi les itérateurs 
}
