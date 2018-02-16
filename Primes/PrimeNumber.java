import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		int limit = 100000000;
		boolean isPrime;
		ArrayList<Integer> primeArray = new ArrayList<Integer>();
		final double startTime = System.currentTimeMillis();
		if(limit>=2) {
			primeArray.add(2);
		}
		for(int i=3; i<=limit; i+=2) {
			isPrime = true;
			for(int j=3; j<=Math.sqrt(i); j+=2) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
		if(isPrime) {
			//System.out.println(i);
			primeArray.add(i);
		}
		}
		final double endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + ((endTime - startTime)/1000) + "s");
		int size = primeArray.size();
		System.out.println(size);
	}
}