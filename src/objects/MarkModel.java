package objects;

public class MarkModel {
	private String mark;
	private String model;
	
	public MarkModel(String mark, String model) {
		this.mark = mark;
		this.model = model;
	}
	
	public String getMark() {
		return mark;
	}

	public String getModel() {
		return model;
	}	

	public String toString() {
		return mark + " " + model;
	}
}



