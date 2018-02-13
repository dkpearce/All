
public class TooHot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(temperature(true, 100));
	}
	
	static boolean temperature(boolean season, int temp) {
		if (season) 
		{
			if (temp >= 60 & temp <= 100) {
				return true;
			}
			
			else
			{
				return false;
			}
		}
		else
		{
			if (temp >= 60 & temp <= 90) 
			{
				return true;
			}
			
			else 
			{
				return false;
		}
		}
	}

}
