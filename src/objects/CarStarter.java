package objects;

import java.util.Arrays;

public class CarStarter {

	public static void main(String[]args) {
		Car [] cars  = CarCreator.create();
		
		
		for (int i = 0; i < cars.length ; i++) {
			System.out.println(cars[i]);
		}
	}
}
