
public class Board {

//  cells[]
// at this time - this class does not have any substance
// it is only have only one behavior called print. which is actually not  natural behavior of the Board
//  i like to have a board which can be set up in different combinations of snake and ladders
// each time I initialise a board I would like to have different set of snake and ladders


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
