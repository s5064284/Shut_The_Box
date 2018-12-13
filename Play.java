import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		Boxes boxes = new Boxes();
		Scanner scan = new Scanner (System.in);
		int userNumber1;
		int userNumber2;

		while(boxes.checkWin() != 9)
		{	
			dice1.roll();
			dice2.roll();
			System.out.println("Dice rolled: " + (dice1.getFaceValue()) + " " + (dice2.getFaceValue()));
			System.out.println("\n");
			System.out.println("*****BOXES OPEN*****");
			boxes.getBox();
			System.out.println("\n");
			System.out.println("**********************" + "\n");
			System.out.println("Enter Box(es) to shut: The total must equal the total of your dice roll");
			System.out.println("Box 1");
			userNumber1 = scan.nextInt();
			System.out.println("Box 2");
			userNumber2 = scan.nextInt();

			if ((userNumber1 + userNumber2 > dice1.getFaceValue() + dice2.getFaceValue()) ||
					(userNumber1 + userNumber2 < dice1.getFaceValue() + dice2.getFaceValue()))
					{
				System.out.println("Please ensure the total euqals the total dice roll");	
					}
			else
			{
				boxes.setBox(userNumber1, userNumber2);
				boxes.getBox();
				System.out.println("\n");
				boxes.checkWin();
			}

		}
		System.out.println("You win!");
	}

}
