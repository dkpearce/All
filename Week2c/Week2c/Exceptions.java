
public class Exceptions {

	public static void main(String[] args) {
		int a;
		try {
		a = 4/0;
		System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println("Go Home User you're drunk");
		}
	}

}
