import java.util.Random;

public class Dice {
	
	int num;
	
	void rollDice(){
		Random rand = new Random();
		
		num = rand.nextInt(6) + 1;
	}
	
	int getCurrentStatus(){
		System.out.println(num);
		return num;
	}
}