public class mainMethod {

	public static void main(String[] args) {
		
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
			int dice1 = d1.generateRandom();
			int dice2 = d2.generateRandom();
			
			System.out.println("Lets check if its equal. Shall we. ?");
			System.out.println(dice1);
			System.out.println(dice2);
			
			if(dice1 == dice2){
				System.out.println(" Yeh !! Both the dice you rolled are same");
			} else {
				System.out.println("Dang !! Lets try this again");
			}
	}

}
