package biblioteka;

	public class PersonCreator {
		public static Person[] create() {
			
			Book hP = new Book ("Harry Poter","J.K. Rowling");
			Book qV = new Book ("Quo vadis","H. Sienkiewicz");
			Book d = new Book ("Dziady","A. Mieckiewicz");
			Book wOM= new Book ("Wszystko o Motorach", "OstryCie�Mg�y");
			Book jBDP= new Book ("Jak by� dobrym pieskiem","Rafik Psi�ski");
			Book jIMP = new Book ("Ja i m�j pasat","Janusz Kowalski");
			
			Person[]  imiona = {new Person("Marcinek","Bartosiewicz"),
					new Person("Nadia","Grz�da"),
					new Person("Tomek","Parasol"),
					new Person("Ania","Lupa"),
					new Person("Rafik","Psi�ski"),
					new Person("Piter","Domaga�a")};
			return imiona;		
		} 

}
