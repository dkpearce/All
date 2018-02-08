
public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(calculation(21, 20));
	}
	static int calculation(int number1, int number2) {
		
		if	((number1 > number2 & number1 <= 21) | (number2 > 21 & number1 <= 21)) 
		{
			return number1;
		}
		
		else if (number2 <= 21)
		{
			return number2;
		}
		
		else  
		{
			return 0;
		}
	}
	
}
