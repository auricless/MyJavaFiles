import java.util.Scanner;

public class BattleOfNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int contestants;
		do {
			System.out.print("Enter the number of Contestants: ");
			contestants = InputHelper.validate(in.nextLine());
		}while(contestants == 0);
		
		Controller tournament = new Controller(contestants);
		
		tournament.startSimulation();
		
	}
	
}