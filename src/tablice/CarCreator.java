package tablice;

public class CarCreator {
	public static Car[] create() {
		Car[]  samochody = {new Car("Toyota","Avensis", "WX 43554"),
				new Car("Fiat","Punto", "TK 52N24"),
				new Car("BMW","x5", "ZK 11029"),
				new Car("Porsche","911", "TSZ 3321"),
				new Car("Lamborghini","Aventador", "WB 6540"),
				new Car("Ford","Mondeo", "KR 0H492")};
		return samochody;		
	} 
}


