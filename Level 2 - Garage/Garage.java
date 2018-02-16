
public class Garage {

	public static void main(String[] args) {
		
	Car car1 = new Car("GT86", "Orange", 15000, "XB13 DFT");
	
	Lorry lorry1 = new Lorry(6, "Black", 20000, "AB12 EDF");

	Motorbike bike1 = new Motorbike(200, "Red", 10000, "TB16 UHF");
	
	System.out.println(car1.toStringcar());

	System.out.println(lorry1.toStringlorry());
	}

}
