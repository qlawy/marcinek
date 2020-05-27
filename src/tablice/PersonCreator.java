package tablice;

import objects.Car;
import objects.MarkModel;

public class PersonCreator {
	public static Person[] create() {	
		MarkModel avensis = new MarkModel("Toyota","Avensis");
		MarkModel punto =	new MarkModel("Fiat","Punto");
		
		Car naszePunto = new Car(punto,"o3i5h46");
		Car naszaToyota = new Car(avensis,"WB4348H");
		
		Person[]  imiona = {new Person("Marcinek","Bartosiewicz"),
				new Person("Nadia","Grz�da"),
				new Person("Tomek","Parasol", naszaToyota),
				new Person("Ania","Lupa", naszePunto),
				new Person("Rafik","Psi�ski"),
				new Person("Piter","Domaga�a")};	
		return imiona;		
	}
	
	
}
