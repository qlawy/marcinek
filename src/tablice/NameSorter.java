package tablice;

import java.util.Arrays;

public class NameSorter {

	public static void main(String[] args) {

		String[] imiona = { "Zenek","Nadia","Marian", "Marcinek", "Tomek", "Ania", "Rafik", "Piter","Adam" };
		boolean czyCosSieZminilo= true;
		while(czyCosSieZminilo) {
			czyCosSieZminilo=sortuj(imiona);
		};
		
		System.out.println(Arrays.asList(imiona));
	}

	private static boolean sortuj(String[] imiona) {
		boolean czyCosZmianil = false; 
		for (int i = 0; i < imiona.length - 1; i++) {
			int k = i + 1;
			System.out.println(shouldBeChanged(imiona[i], imiona[k]));
			if (shouldBeChanged(imiona[i], imiona[k])) {
				String przechowywaczka = imiona[i];
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
