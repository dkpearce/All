
public class Garage {

	public static void main(String[] args) {
		
	Car car1 = new Car();
	
	car1.setmodel("GT86");
	car1.setcolour("Orange");
	car1.setprice(15000);
	car1.setnumberPlate("XB13 DFT");
	
	Lorry lorry1 = new Lorry();
	
	lorry1.setwheelCount(6);
	lorry1.setcolour("Black");
	lorry1.setprice(20000);
	lorry1.setnumberPlate("AB12 EDF");
	
	

	
	
	System.out.println(car1.toString());
	System.out.println(car1.toStringCar());
	}

}
