
public abstract class Store {
	String name;
	String event;
	double price;
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEvent() {
		return event;
	}




	public void setEvent(String event) {
		this.event = event;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public abstract double grade();
}
