
public class Vehicle {
	
	public String colour;
	public int price;
	public String manufacturer;
	

	public Vehicle(String colour, int price, String manufacturer) {
		this.colour = colour;
		this.price = price;
		this.manufacturer = manufacturer;	
	}

	public String toString() {
		return "Colour:" + colour + " Price:" + price + " Manufacturer" + manufacturer;
	
	}
}
