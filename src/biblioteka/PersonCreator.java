package biblioteka;

	public class PersonCreator {
		public static Person[] create() {
			
			Book hP = new Book ("Harry Poter","J.K. Rowling");
			Book qV = new Book ("Quo vadis","H. Sienkiewicz");
			Book d = new Book ("Dziady","A. Mieckiewicz");
			Book wOM= new Book ("Wszystko o Motorach", "OstryCieñMg³y");
			Book jBDP= new Book ("Jak byæ dobrym pieskiem","Rafik Psiñski");
			Book jIMP = new Book ("Ja i mój pasat","Janusz Kowalski");
			
			Person[]  imiona = {new Person("Marcinek","Bartosiewicz"),
					new Person("Nadia","Grzêda"),
					new Person("Tomek","Parasol"),
					new Person("Ania","Lupa"),
					new Person("Rafik","Psiñski"),
					new Person("Piter","Domaga³a")};
			return imiona;		
		} 

}
