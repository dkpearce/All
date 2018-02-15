
public class TaxCalculations {

	public float calculateNetSalary(int salary, int absenties)throws myexception{
		float netsalary = 0;
		if(absenties >=14) {
			myexception e = new myexception();
			throw e;
		}
		netsalary = salary *80/100 - (salary/30 * absenties);
		return netsalary;
	}
}
