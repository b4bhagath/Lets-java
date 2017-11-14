import java.util.Scanner;

public class gameInit {

	int userRoll;
	String playAgain = "y";
	int userPosition = 0;
	
	public void start(){
			
			Scanner s 		= new Scanner(System.in);
			Board b 		= new Board();
			Dice d 			= new Dice();
			snakeLadder snl = new snakeLadder();
			
			b.printBoard();
			
			userRoll = d.rollDice();
			
			while(playAgain.equals("y") || playAgain.equals("Y")){
				
				snl.updateUserPosition(userPosition, playAgain, userRoll);
				
			}
			
			System.out.println("You agreed to stop");
			s.close();
		}
}
