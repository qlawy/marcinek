package tablice;

import java.util.Arrays;

public class NameSorter {

	public static void main(String[] args) {

		Person[] imiona = {
				new Person("Marcinek","Bartosiewicz"),
				new Person("Nadia","Grz�da"),
				new Person("Tomek","Parasol"),
				new Person("Ania","Lupa"),
				new Person("Rafik","Psi�ski"),
				new Person("Piter","Domaga�a")};
		
		boolean czyCosSieZminilo= true;
		while(czyCosSieZminilo) {
			czyCosSieZminilo=sortuj(imiona);
		};
		
		System.out.println(Arrays.asList(imiona));
	}

	private static boolean sortuj(Person[] imiona) {
		boolean czyCosZmianil = false; 
		for (int i = 0; i < imiona.length - 1; i++) {
			int k = i + 1;
			if (shouldBeChanged(imiona[i].getSurname(), imiona[k].getSurname())) {
				Person przechowywaczka = imiona[i];
				imiona[i] = imiona[k];
				imiona[k] = przechowywaczka;
				czyCosZmianil=true;
			

			}
		}
	return czyCosZmianil;
	}

	private static boolean shouldBeChanged(String first, String second) {

		return first.compareTo(second) > 0;

	}
}
