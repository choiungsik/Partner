
public class Restaurant extends Store{
	
	double service;
	double flavor;
	double clean;

	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
		this.name = name;
		this.event = event;
		this.price = price;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}


	@Override
	public double grade() {
		double total = price+service+flavor+clean;
		// 평균구하는 기능 작성
		return total/4;
	}


	public double getService() {
		return service;
	}


	public void setService(double service) {
		this.service = service;
	}


	public double getFlavor() {
		return flavor;
	}


	public void setFlavor(double flavor) {
		this.flavor = flavor;
	}


	public double getClean() {
		return clean;
	}


	public void setClean(double clean) {
		this.clean = clean;
	}
	
	

}
