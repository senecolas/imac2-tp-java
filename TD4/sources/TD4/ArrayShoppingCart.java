package TD4;

public class ArrayShoppingCart {
	
	private Book[] books;
	private int nbBook;
	private int maxNbBook;
	// 1. Il n'est pas intéressant de stocker le nombre maximum de livres dans un champ statique
	//    car, selon l'énnoncé, ce nombre peut changer en fonction de chaque instance de la classe
	
	
	public ArrayShoppingCart(int maxNbBook) {
		super();
		this.books = new Book[maxNbBook];
		this.nbBook = 0;
		this.maxNbBook = maxNbBook;
	}

	public void add(Book b) throws Exception {
		if(this.nbBook >= this.maxNbBook) {
			throw new Exception("This ArrayShoppingCart is full");
		}
		this.books[this.nbBook++] = b;
	}
	
	// 2.3.
	@Override
	public String toString() {
	    StringBuilder res = new StringBuilder();
	    
	    res.append("This ArrayShoppingCart have ");
	    res.append(this.nbBook);
	    res.append(" book(s).");
	    
	    for (Book book : this.books) {
	    	res.append("\n - ");
	    	res.append(book);
	    }
	    return res.toString();
	}
	
	// 2.4.
	public Book longestTitle() {
		int longest = 0;
		Book longestBook = null;
		for (Book book : this.books) {
			if (book.getTitle().length() > longest) {
				longest = book.getTitle().length();
				longestBook = book;
			}
		}
		return longestBook;
	}	
	
}
