
public class Car extends Vehicle {
	
	public String model;
	
	public Car(String model, String colour, int price, String numberPlate) {
		this.model = model;
		
	}
	public void setmodel(String a) {
		model = a;
	}
		
	public String toStringCar() {
		return " Model: " + model;
	
	}

}
