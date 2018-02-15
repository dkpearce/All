
public class Vehicle {
	
	public String colour;
	public int price;
	public String numberPlate;
	

	public Vehicle() {
	
	}
	public void setcolour(String a) {
		colour = a;
	}
	public void setprice(int a) {
		price = a;
	}
	public void setnumberPlate(String a) {
		numberPlate = a;
	}

	public String toString() {
		return "Colour: " + colour + " Price: " + price + " Numberplate: " + numberPlate;
	
	}
}
