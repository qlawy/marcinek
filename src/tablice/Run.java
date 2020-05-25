package tablice;

import tablice.sort.Sorter;

public class Run {
	
	public  static void main(String[] args)  {

		Person[] imiona = {
				new Person("Marcinek","Bartosiewicz"),
				new Person("Nadia","Bartosiewicz"),
				new Person("Tomek","Bartosiewicz"),
				new Person("Ania","Bartosiewicz"),
				new Person("Rafik","Bartosiewicz"),
				new Person("Piter","Domaga³a")};
		

		for (int i=0; i<imiona.length; i++) {
			System.out.println("imie "+(i+1)+" - "+imiona[i]);		
		}
	}
	
	private  static boolean shouldBeChanged(String first , String second){
		return first.compareTo(second)>0;
	}

}
