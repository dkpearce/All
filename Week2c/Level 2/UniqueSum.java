
public class UniqueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply(1,2,3));
	}
		static int multiply(int number1, int number2, int number3) {
			
			if (number1 == number2 & number2 == number3) 
			{
				return 0;
			}
			
			else if (number1 == number2) 
			{
				return number3;
			}
			
			else if (number2 == number3)
			{
				return number1;
			}
			
			else if (number1 == number3)
			{
				return number2;
			}
			
			else
			{
				return number1 + number2 + number3;
			}
		}

}
