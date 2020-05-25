package tablice;

import java.time.Instant;

public class Person {
	private String name; 
	private String surname;
	private Instant bornDate;
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person(String name, String surname, Instant bornDate) {
		this.name = name;
		this.surname = surname;
		this.bornDate = bornDate;
	}

	public String getName() {
		return name;
	}
	public  String getSurname() {
		return surname;
	}
	public void setBornDate(Instant bornDate) {
		this.bornDate = bornDate;
	}
	public Instant getBornDate() {
		return bornDate;
	}
	
	public String toString() {
		return name + " " + surname; 
	}
}
