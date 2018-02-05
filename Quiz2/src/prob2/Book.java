package prob2;

public class Book extends LendingItem {
	
	String isbn;
	String title;
	String authorFirstName;
	String authorLastName;
	
	public Book(String isbn, String title, String authorFirstName, String authorLastName) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}
	
}
