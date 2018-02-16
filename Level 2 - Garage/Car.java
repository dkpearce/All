
public class Car extends Vehicle {
	
	public String model;
	
	public Car(String model, String colour, int price, String numberPlate) {
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.numberPlate = numberPlate;
		
	}
	public void setmodel(String a) {
		model = a;
	}
		
	public String toStringcar() {
		return toString() + " Model: " + model;
	
	}

}
