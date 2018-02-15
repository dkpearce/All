
public class Lorry extends Vehicle {
	
	public int wheelCount;
	
	public Lorry(int wheelCount, String colour, int price, String numberPlate) {
		this.wheelCount = wheelCount;
		this.colour = colour;
		this.price = price;
		this.numberPlate = numberPlate;
	}

	public void setwheelCount(int a) {
		wheelCount = a;
	}
	public String toStringlorry() {
		return toString() + " Wheels: " + wheelCount;
	}
}
