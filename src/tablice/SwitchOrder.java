package tablice;

import java.util.Arrays;

public class SwitchOrder {

	public static void main(String[] args) {
		String[] imiona = { "Zenek", "Nadia", "Marian", "Marcinek", "Tomek", "Ania", "Rafik", "Piter", "Adam" };
		for (int i = 0; i < imiona.length / 2 ; i++) {
			int k = imiona.length - i - 1;
			String przechowywaczka = imiona[i];
			imiona[i] = imiona[k];
			imiona[k] = przechowywaczka;
		}
		System.out.println(Arrays.asList(imiona));

	}

}
