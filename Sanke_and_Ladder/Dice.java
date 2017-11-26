import java.util.Random;

// this is ok
// I might want to have a property called as current state.which heps me to inspect
public class Dice {

	public int rollDice(){

		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}
}
