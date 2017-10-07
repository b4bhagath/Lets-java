public class mainMethod {

	public static void main(String[] args) {
		
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
			d1.rollDice();
			d2.rollDice();
			
			System.out.println("Lets check if its equal. Shall we. ?");
			int dice1 = d1.getCurrentStatus();
			int dice2 = d2.getCurrentStatus();
			
			if(dice1 == dice2){
				System.out.println(" Yeh !! Both the dice you rolled are same");
			} else {
				System.out.println("Dang !! Lets try this again");
			}
	}

}
