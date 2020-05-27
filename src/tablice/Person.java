package tablice;

import objects.Car;

public class Person {
	private String name; 
	private String surname;
	private  Car car;
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person(String name, String surname, Car car ) {
		this.name = name;
		this.surname = surname;
		this.car = car;
	}

	public String getName() {
		return name;
	}
	public  String getSurname() {
		return surname;
	}
	public Car getCar() {
		return car;
	}
	
	public String toString() {
		return name + " " + surname + " " + car; 
	}
}
