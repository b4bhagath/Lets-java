import java.util.Random;

public class Dice {

	int generateRandom(){
		Random rand = new Random();
		
		int num = rand.nextInt(6) + 1;
		return num;
	}
}