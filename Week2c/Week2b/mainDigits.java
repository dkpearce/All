import java.util.Scanner;

public class mainDigits {

	public static void main(String[] args) {
	digits digits = new digits();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Input any 3 Digit Number:");
	
	int number = scanner.nextInt();
	digits.digitsToWords(number);
	
	}
}
