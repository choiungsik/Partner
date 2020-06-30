
public class Salon extends Store {
	
	double technology;
	double kindness;

	public Salon(String name, String event, double price, double technology, double kindness) {
		this.name = name;
		this.event = event;
		this.price = price;
		this.technology = technology;
		this.kindness = kindness;
	}

	@Override
	public double grade() {
		double total = price+technology+kindness;
		// 평균기능 구현
		return total/3;
	}
	
	

	public double getTechnology() {
		return technology;
	}

	public void setTechnology(double technology) {
		this.technology = technology;
	}

	public double getKindness() {
		return kindness;
	}

	public void setKindness(double kindness) {
		this.kindness = kindness;
	}
	
	

}
