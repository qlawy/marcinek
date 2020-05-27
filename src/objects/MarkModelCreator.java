package objects;

public class MarkModelCreator {
	public static MarkModel [] create() {
		
		MarkModel[]  markModels = {new MarkModel("Toyota","Avensis"),
				new MarkModel("Fiat","Punto"),
				new MarkModel("BMW","x5"),
				new MarkModel("Porsche","911"),
				new MarkModel("Lamborghini","Aventador"),
				new MarkModel("Ford","Mondeo")};
		return markModels;		
	} 
}
