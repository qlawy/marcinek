package objects;

public class CarCreator {
	public static Car[] create() {
		
		MarkModel avensis = new MarkModel("Toyota","Avensis");
		MarkModel punto =	new MarkModel("Fiat","Punto");
//			new MarkModel("BMW","x5"),
//			new MarkModel("Porsche","911"),
//			new MarkModel("Lamborghini","Aventador"),
//			new MarkModel("Ford","Mondeo")};
		
		
		Car[]  samochody = {new Car(avensis,"b3yu2"),
				new Car(punto,"o3i5h46"),
				new Car(avensis,"345oijkhn6"),
				new Car(punto,"9uhog345"),
				new Car(punto,"kuhio456"),
				new Car(avensis,"o354ih6")};
		return samochody;		
	} 


}
