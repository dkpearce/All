import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Adventure {

	static int[][] map;
	static int playeriLocation;
	static int playerjLocation;
	static int treasureiLocation;
	static int treasurejLocation;
	static boolean treasureFound = false;
	static Player player1 = new Player(0);
	static boolean stillPlaying = true;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("\r\n" + 
				"___________.__              __________                                             _____                           \r\n" + 
				"\\__    ___/|  |__    ____   \\______   \\_____   _______ _______   ____    ____     /     \\    ____    ____  _______ \r\n" + 
				"  |    |   |  |  \\ _/ __ \\   |    |  _/\\__  \\  \\_  __ \\\\_  __ \\_/ __ \\  /    \\   /  \\ /  \\  /  _ \\  /  _ \\ \\_  __ \\\r\n" + 
				"  |    |   |   Y  \\\\  ___/   |    |   \\ / __ \\_ |  | \\/ |  | \\/\\  ___/ |   |  \\ /    Y    \\(  <_> )(  <_> ) |  | \\/\r\n" + 
				"  |____|   |___|  / \\___  >  |______  /(____  / |__|    |__|    \\___  >|___|  / \\____|__  / \\____/  \\____/  |__|   \r\n" + 
				"                \\/      \\/          \\/      \\/                      \\/      \\/          \\/                         \r\n" + 
				"");
		System.out.println("Welcome to The Adventure of the Barren Moor!");
		System.out.println("What size game would you like? (Recommended 10)");
		int size = scanner.nextInt();
		map = new int[size][size];
		playeriLocation = (map.length/2);
		playerjLocation = (map.length/2);
		treasureiLocation = randomNumber();
		treasurejLocation = randomNumber();
		
		while(stillPlaying) {
			System.out.println("Choose a direction. (North, East, South, West)");
			
			
			
			move();
			System.out.println("Thanks For Playing! :)");
			scanner.close();
		}
			
	}
	public static int randomNumber() 
	{
		Random rand = new Random();
		int n = rand.nextInt(map.length);
		return n;
	}
	private static void move(){
		Scanner inputScanner = new Scanner(System.in);
		
		while(stillPlaying) {
			for(int i = 0; i < map.length; i++) {
				for(int j = 0; j < map.length; j++) {
					if(i == playeriLocation && j == playerjLocation) 
					{
					map[i][j] = 1;
					System.out.print("P");
					System.out.print(" | ");
					}
					else if(i == treasureiLocation && j == treasurejLocation) 
					{
					map[i][j] = 2;
					System.out.print("-");
					System.out.print(" | ");
					}
					else
					{
					map[i][j] = 0;
					System.out.print("-");
					System.out.print(" | ");
					}
					
				}
				System.out.println();
				}
					double distanceX = treasureiLocation - playeriLocation;
					double distanceY = treasurejLocation - playerjLocation;
					double squareDistX = distanceX * distanceX;
					double squareDistY = distanceY * distanceY;
					double distFromWin = Math.sqrt(squareDistX + squareDistY);
					DecimalFormat df = new DecimalFormat("###.###");
					System.out.println("You are " + df.format(distFromWin) + "m away from the treasure.");				
			if(playeriLocation == treasureiLocation && playerjLocation == treasurejLocation) {
				System.out.println("\r\n" + 
						"     )      )                        (         )     ____    ____ \r\n" + 
						"  ( /(   ( /(              (  (      )\\ )   ( /(    |   /   |   / \r\n" + 
						"  )\\())  )\\())      (      )\\))(   '(()/(   )\\())   |  /    |  /  \r\n" + 
						" ((_)\\  ((_)\\       )\\    ((_)()\\ )  /(_)) ((_)\\    | /     | /   \r\n" + 
						"__ ((_)   ((_)   _ ((_)   _(())\\_)()(_))    _((_)   |/      |/    \r\n" + 
						"\\ \\ / /  / _ \\  | | | |   \\ \\((_)/ /|_ _|  | \\| |  (       (      \r\n" + 
						" \\ V /  | (_) | | |_| |    \\ \\/\\/ /  | |   | .` |  )\\      )\\     \r\n" + 
						"  |_|    \\___/   \\___/      \\_/\\_/  |___|  |_|\\_| ((_)    ((_)    \r\n" + 
						"                                                                  \r\n" + 
						"");
				stillPlaying = false;
			}
			else {
			
				String direction = inputScanner.nextLine();
				if(direction.equalsIgnoreCase("North")) 
				{
					playeriLocation--;
					System.out.println("You move North");
				}
				else if(direction.equalsIgnoreCase("East")) 
				{
					playerjLocation++;
					System.out.println("You move East");
				}
				else if(direction.equalsIgnoreCase("South")) 
				{
					playeriLocation++;
					System.out.println("You move South");
				}
				else if(direction.equalsIgnoreCase("West")) 
				{
					playerjLocation--;
					System.out.println("You move West");
				}
				else 
				{
					System.out.println("Invalid Input");
				}
			}
			
		}
		inputScanner.close();
		
	}

}
