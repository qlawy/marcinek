package biblioteka;

import java.util.Set;

public class LibraryCustomer extends Person {
	private  Set<Book> books;
		
	public LibraryCustomer (String name, String surname, Set<Book> books) {
		super(name, surname);
		this.books = books;
	}
	
	public Set<Book> getBooks(){
		return books;
	}
	
	public String toString() {
		return books.toString(); 
	}

	}

