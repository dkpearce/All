
public class Motorbike extends Vehicle {
	
	public int cc;
	
	public Motorbike(int cc, String colour, int price, String numberPlate) {
		this.cc = cc;
		this.colour = colour;
		this.price = price;
		this.numberPlate = numberPlate;
	}
	
	public void setcc(int a) {
		cc = a;
	}

}
