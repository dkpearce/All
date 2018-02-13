
public class digits {

	public void digitsToWords(int a){
		int singleDigit = a%10;
		int firstDigit = ((a%100)/10);
		int thirdDigit = a/100;
		
		switch (thirdDigit) {
		case 1: thirdDigit = 1;
			System.out.print("One Hundred ");
			break;
		case 2: thirdDigit = 2;
			System.out.print("Two Hundred ");
			break;
		case 3: thirdDigit = 3;
			System.out.print("Three Hundred ");
			break;
		case 4: thirdDigit = 4;
			System.out.print("Four Hundred ");
			break;
		case 5: thirdDigit = 5;
			System.out.print("Five Hundred ");
			break;
		case 6: thirdDigit = 6;
			System.out.print("Six Hundred ");
			break;
		case 7: thirdDigit = 7;
			System.out.print("Seven Hundred ");
			break;
		case 8: thirdDigit = 8;
			System.out.print("Eight Hundred ");
			break;
		case 9: thirdDigit = 9;
			System.out.print("Nine Hundred ");
			break;
		default: 
			break; 
		}
		if (thirdDigit != 0 && (singleDigit != 0 || firstDigit != 0)) {
			System.out.print("and ");
		}
		if (firstDigit == 1) 
		{
			switch (singleDigit){
			case 0: singleDigit = 0;
				System.out.println("Ten");
				break;
			case 1: singleDigit = 1;
				System.out.println("Eleven");
				break;
			case 2: singleDigit = 2;
				System.out.println("Twelve");
				break;
			case 3: singleDigit = 3;
				System.out.println("Thirteen");
				break;
			case 4: singleDigit = 4;
				System.out.println("Fourteen");
				break;
			case 5: singleDigit = 5;
				System.out.println("Fifteen");
				break;
			case 6: singleDigit = 6;
				System.out.println("Sixteen");
				break;
			case 7: singleDigit = 7;
				System.out.println("Seventeen");
				break;
			case 8: singleDigit = 8;
				System.out.println("Eighteen");
				break;
			case 9: singleDigit = 9;
				System.out.println("Nineteen");
				break;
			default: 
				break;
			}
		}
		else
		{
				switch(firstDigit) {
			case 2: firstDigit = 2;
				System.out.print("Twenty ");
				break;
			case 3: firstDigit = 3;
				System.out.print("Thirty ");
				break;
			case 4: firstDigit = 4;
				System.out.print("Fourty ");
				break;
			case 5: firstDigit = 5;
				System.out.print("Fifty ");
				break;
			case 6: firstDigit = 6;
				System.out.print("Sixty ");
				break;
			case 7: firstDigit = 7;
				System.out.print("Seventy ");
				break;
			case 8: firstDigit = 8;
				System.out.print("Eighty ");
				break;
			case 9: firstDigit = 9;
				System.out.print("Ninety ");
				break;
				}
		if (firstDigit == 1) 
		{
			
		}
		else 
		{
			switch(singleDigit) {
				case 1: singleDigit = 1;
					System.out.println("One");
					break;
				case 2: singleDigit = 2;
					System.out.println("Two");
					break;
				case 3: singleDigit = 3;
					System.out.println("Three");
					break;
				case 4: singleDigit = 4;
					System.out.println("Four");
					break;
				case 5: singleDigit = 5;
					System.out.println("Five");
					break;
				case 6: singleDigit = 6;
					System.out.println("Six");
					break;
				case 7: singleDigit = 7;
					System.out.println("Seven");
					break;
				case 8: singleDigit = 8;
					System.out.println("Eight");
					break;
				case 9: singleDigit = 9;
					System.out.println("Nine");
					break;
					}
			if(singleDigit == 0 && firstDigit ==0 && thirdDigit == 0) {
				System.out.println("Zero");
			}
		}
		}
		
		
	}
}
