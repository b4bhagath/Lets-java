
public class snakeLadder {

	// why this class ?
	// what is the main responsibility of this class?
	// you seem to be trying to say this is the logic with which the machine cn detemine if the
	// current position is  a snake or a ladder
	// its okay. but the issue is that this game is very rigid.
	// only one combination
	// also the name of the class and the functions in it - does not see to agree
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
			isSnake();
		} else if(userPosition == snakeNladder[1]){
			userPosition = 33;
			isSnake();
		} else if(userPosition == snakeNladder[2]){
			userPosition = 9;
			isLadder();
		} else if(userPosition == snakeNladder[3]){
			userPosition = 49;
			isLadder();
		} else if(userPosition == snakeNladder[4]){
			userPosition = 91;
			isSnake();
		} else if(userPosition == snakeNladder[5]){
			userPosition = 64;
			isLadder();
		} else if (userPosition > 100){
			System.out.println("Oh! You cant jump off the board");
			userPosition = userPosition - userRoll;
		}

		return userPosition;
	}

	public void updateUserPosition(int userPosition, String playAgain, int userRoll){

			System.out.println("=================================================================================");
			System.out.println("You previosly were at " + userPosition);
			System.out.println("User rolled " + userRoll);

			userPosition = userRoll + userPosition;

			System.out.println("Now your at " + userPosition);

			userPosition = checkForSNL(userPosition, userRoll);

			System.out.println("=================================================================================");

			if (userPosition == 100){
				System.out.println("Congratulations you just won");
			}
	}
	// the name of the function suggests - it is checking for something .
	// but it is only printing something.
	public void isSnake(){
		System.out.println("Cool. Way up you go in the ladder");
	}

	public void isLadder(){
		System.out.println("Oh Snap ! You got caught by a snake");
	}
}
