import java.util.ArrayList;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int limit = 100;
		int count = 0;
		boolean isPrime;
		ArrayList<Integer> primeArray = new ArrayList<Integer>();
		final double startTime = System.currentTimeMillis();

		for(int i=2; i<=Math.sqrt(limit); i++) {
			isPrime = true;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
		if(isPrime) {
			System.out.println(i);
			primeArray.add(i);
		}
		}
		for(int i=0; i<primeArray.size(); i++) {
			
			count = limit / primeArray.get(i);
			limit = limit - count;
		}
		final double endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + ((endTime - startTime)/1000) + "s");
		int size = limit;
		System.out.println(size);
	}
}
