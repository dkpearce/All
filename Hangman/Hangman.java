import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public String word;
	public int attempts;

	
	public static void main(String[] args) {
		
		ArrayList<String> wordArray = new ArrayList<String>();
		
		File words = new File("\\Users\\Admin\\Documents\\words.txt");
		
		try 
		{
			Scanner wordReader = new Scanner(words);
			
			while (wordReader.hasNextLine())
			{
			    wordArray.add(wordReader.nextLine());
			}
			wordReader.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		
		
		int arrayValue = arrayNumber(wordArray);
	
		System.out.println(wordArray.get(arrayValue));
		
		
		String cleanWord = (wordArray.get(arrayValue)).replaceAll("\\p{P}", "");
		String secretWord = (cleanWord).replaceAll("[a-zA-Z]","_ ");
		System.out.println(secretWord);
		
		System.out.println("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello " + name + ", Enter Difficulty Level 1)Easy 2)Medium 3)Hard: ");
		
		difficultyTest();
		scanner.close();
		
		Scanner inputScanner = new Scanner(System.in);
		char guess = inputScanner.next("[A-Za-z]").charAt(0);
		System.out.println("Enter a letter to guess the word:");
		
		
		for(int i = 0; i <= cleanWord.length(); i++)
		{
			char letter = cleanWord.charAt(i);
				if(letter == guess);{
					System.out.println("done");
					
					
				}
				
			
		
		}
		inputScanner.close();
	}
	
	
	public static int arrayNumber(ArrayList<String> wordArray) {
		
		Random rand = new Random();

		int  n = rand.nextInt(wordArray.size());
		
		return n;
		
	}
	
	public static int difficultyTest() {
		
		Scanner scannerDifficulty = new Scanner(System.in);
		
		int n = 0;
		
	while(n == 0) {
		
		int difficulty;
		difficulty = scannerDifficulty.nextInt();
		
		if(difficulty == 1) 
		{
			System.out.println("Easy Selected");
			n = 1;
		}
		else if(difficulty == 2) 
		{
			System.out.println("Medium Selected");
			n = 2;
		}
		else if(difficulty == 3) 
		{
			System.out.println("Hard Selected");
			n = 3;
		}
		else 
		{
			System.out.println("Not a valid selection, Please pick either 1, 2 or 3.");
		}
	}
		scannerDifficulty.close();
		return n;
	}
	
	public String toString() {
		return this.word; 
	}
}
