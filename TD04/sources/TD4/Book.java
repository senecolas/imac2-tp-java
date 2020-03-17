package TD4;


import java.util.Objects;
 
/** 
 * @desc TD3 - Book
 * @author Nicolas SENECAL
 */
public class Book { 

  private String title;
  private String author;
  private boolean hasAuthor;

  public Book(String title, String author) {
    this.title = Objects.requireNonNull(title, "Title can not be null");
    this.author = Objects.requireNonNull(author, "Author can not be null, set it to <no author>");
    this.hasAuthor = true;
  }

  public Book(String title) {
    this(title, "<no author>");
    this.hasAuthor = false;
  }

  public static void main(String[] args) {
    /*
    # var book = new Book();
    # System.out.println(book.title + ' ' + book.author); // affiche null null
    
    1.2. Cette fonction affiche "null null" car les champs d'un objet
    possèdent une valeur par défaut qui leur est affectée lors de sa création :
    null pour les types référence comme "String"
     */
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  @Override
  public boolean equals(Object o) {
    return (o instanceof Book
            && this.getTitle().equals(((Book) o).getTitle())
            && this.getAuthor().equals(((Book) o).getAuthor()));
  }

  @Override
  public String toString() {
    return this.title + (this.hasAuthor ? " by " + this.author : "");
  }
}
