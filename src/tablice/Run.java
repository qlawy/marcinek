package tablice;

import tablice.sort.Sorter;

public class Run {
	
	public  static void main(String[] args)  {
		String imie = "Marcinek";
		String[] imiona = {"Marcinek", "Nadia","Tomek", "Ania", "Rafik", "Piter"};
		
		System.out.println(shouldBeChanged(imiona[0],imiona[3]));
		if  (shouldBeChanged(imiona[0],imiona[3])){
				String przechowywaczka = imiona[0];
				imiona[0] = imiona[3];
				imiona[3] = przechowywaczka;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		for (int i=0; i<imiona.length; i++) {
			System.out.println("imie "+(i+1)+" - "+imiona[i]);		
		}
	}
	
	private  static boolean shouldBeChanged(String first , String second){
		return first.compareTo(second)>0;
	}

}
