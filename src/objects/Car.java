package objects;

public class Car {
	private String number;
	private MarkModel markModel;

	public Car(MarkModel markModel, String number) {
		this.number = number;
		this.markModel = markModel;
	}

	public String getNumber() {
		return number;
	}

	public MarkModel getMarkModel() {
		return markModel;
	}

	public String toString() {
		return markModel + " " + number;
	}
}
