package tablice;

public class CarCreator {
	public static Car[] create() {
		Person[]  samochody = {new Car("Toyota","Avensis"),
				new Car("Fiat","Punto"),
				new Car("BMW","x5"),
				new Car("Porsche","911"),
				new Car("Lamborghini","Aventador"),
				new Car("Ford","Mondeo")};
		return samochody;		
	} 
}


