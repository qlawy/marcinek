package tablice;

public class PersonCreator {
	public static Person[] create() {
		Person[]  imiona = {new Person("Marcinek","Bartosiewicz"),
				new Person("Nadia","Grzêda"),
				new Person("Tomek","Parasol"),
				new Person("Ania","Lupa"),
				new Person("Rafik","Psiñski"),
				new Person("Piter","Domaga³a")};
		return imiona;		
	} 
}
