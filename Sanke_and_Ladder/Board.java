import java.util.Random;

public class Board {

	public void printBoard() {

		for(int i = 1; i<=100 ; i++){
			if((i%10==0)){
				System.out.print(i + "\n");
			} else {
				System.out.print(i + "\t");
			}
		}
	}
	
	public int rollDice(){
		Random rand = new Random();
		
		return rand.nextInt(6) + 1;
	}

	public int checkForSNL(int userPosition, int userRoll) {

		int snakeNladder[] = new int[6];
		snakeNladder[0] = 4; //ladder
		snakeNladder[1] = 19; //ladder
		snakeNladder[2] = 30;// snake
		snakeNladder[3] = 73; // snake
		snakeNladder[4] = 81; // ladder
		snakeNladder[5] = 98;// snake
		
		if(userPosition == snakeNladder[0]){
			userPosition = 20;
			System.out.println("Cool. Way up you go in the ladder");
		} else if(userPosition == snakeNladder[1]){
			userPosition = 33;
			System.out.println("Cool. Way up you go in the ladder");
		} else if(userPosition == snakeNladder[2]){
			userPosition = 9;
			System.out.println("Oh Snap ! You got caught by a snake");
		} else if(userPosition == snakeNladder[3]){
			userPosition = 49;
			System.out.println("Oh Snap ! You got caught by a snake");
		} else if(userPosition == snakeNladder[4]){
			userPosition = 91;
			System.out.println("Cool. Way up you go in the ladder");
		} else if(userPosition == snakeNladder[5]){
			userPosition = 64;
			System.out.println("Oh Snap ! You got caught by a snake");
		} else if (userPosition > 100){
			System.out.println("Oh! You cant jump off the board");
			userPosition = userPosition - userRoll;
		}
		
		return userPosition;
	}
}
