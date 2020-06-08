package biblioteka;

import java.util.HashSet;
import java.util.Set;

public class LibraryCustomerCreator {
	public static void main (String[] arguments) {
		Set<Book> books = new HashSet<>();
		books.add(new Book("Harry Poter", "J.K. Rowling"));
		LibraryCustomer customer = new LibraryCustomer("Marcin", "Bartosiewicz", books); 
	}
}
