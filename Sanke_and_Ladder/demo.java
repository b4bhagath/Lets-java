import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String Choice = null;
		System.out.println("Welcome to the Game Snake and Ladder");
		System.out.println("Do you want to start the Game. ? Y : N");
		Choice = s.nextLine();
		
		while(Choice.equals("y") || Choice.equals("Y")){
			gameInit g = new gameInit();
			
			g.start();
			System.out.println("Wanna Start the game again? Y : N");
		}
		System.out.println("Cya");
		s.close();
	}

}
