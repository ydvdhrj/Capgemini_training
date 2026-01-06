package hasarelationship;

public class RAM {
	private int size;
	private String model;
	RAM(int size, String model){
		this.size = size;
		this.model = model;
	}
	public RAM setSize(int size) {
		this.size = size;
		return this;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public String getModel() {
		return model;
	}
}
