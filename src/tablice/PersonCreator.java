package tablice;

public class PersonCreator {
	public static Person[] create() {
		Person[]  imiona = {new Person("Marcinek","Bartosiewicz"),
				new Person("Nadia","Grz�da"),
				new Person("Tomek","Parasol"),
				new Person("Ania","Lupa"),
				new Person("Rafik","Psi�ski"),
				new Person("Piter","Domaga�a")};
		return imiona;		
	} 
}
