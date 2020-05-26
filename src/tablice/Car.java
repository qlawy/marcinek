package tablice;

public class Car {
	private String number;
	private String mark;
	private String model;

	public Car(String number, String mark, String model) {
		this.number = number;
		this.mark = mark;
		this.model = model;
	}

	public String getNumber() {
		return number;
	}

	public String getMark() {
		return mark;
	}

	public String getModel() {
		return model;
	}	

public String toString() {
	return mark + " " + model + " " + number;
	}
}