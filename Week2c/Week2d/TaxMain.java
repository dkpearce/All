
public class TaxMain {

	public static void main(String[] args) {
		TaxCalculations T = new TaxCalculations();
		try {
			float netsalary = T.calculateNetSalary(40000, 10);
			System.out.println(netsalary);
		}
		catch(myexception e){
			System.out.println("I Hate You");
		}

	}

}
