
public class Board {
	
	public void printBoard() {
		
		System.out.println("Lets start the game");
		System.out.println("=================================================================================");

		for(int i = 1; i <= 100 ; i++){
			if((i % 10 == 0)){
				System.out.print(i + "\n");
			} else {
				System.out.print(i + "\t");
			}
		}
		System.out.println("=================================================================================");
	}
}
