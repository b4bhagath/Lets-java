import java.util.Scanner;

public class gameInit {

	public void start(){
		
		Scanner s = new Scanner(System.in);
		String playAgain = "y";
		int userPosition = 0;
		
		System.out.println("Lets start the game");
		System.out.println("=================================================================================");
		Board b = new Board();
		b.printBoard();
		System.out.println("=================================================================================");
		
		while(playAgain.equals("y") || playAgain.equals("Y")){

			System.out.println("=================================================================================");
			System.out.println("You previosly were at " + userPosition);
			
			int userRoll = b.rollDice();
			System.out.println("User rolled " + userRoll);
			
			userPosition = userRoll + userPosition;
			System.out.println("Now your at " + userPosition);
			
			userPosition = b.checkForSNL(userPosition, userRoll);
			
			System.out.println("=================================================================================");
			
			if (userPosition == 100){
				System.out.println("Congratulations you just won");
				System.out.println("Do you want to continue ? Y : N");
				playAgain = s.nextLine();
			} else {
				System.out.println("Do you want to continue ? Y : N");
				playAgain = s.nextLine();
				System.out.println(playAgain);
			}
		}
		System.out.println("You agreed to stop");
		s.close();
	}
}
