
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words = wording();
		System.out.println(words);
		
		int[] arrayofInts = {2,4,6,8,10,12,14,16,18,20};
		for (int i = 0; i < arrayofInts.length; ++i)
			{
			System.out.println("This number is: " + arrayofInts[i]);
			}
		
		for (int i=0; i < 10; i++)
			{
			System.out.println(multiply(1,2,false));
			}
	
	
	}
	
	static String wording() {
		return "Hello World";
	}
	
	static int multiply(int a, int b, boolean condition) {
		
		if (a == 0)
		{
			return b;
		}
		else if (b == 0) 
		{
			return a;
		}
		else if (condition) 
		{
			return a + b;
		}
		else 
		{
			return a * b;
		}
	}
	
}
