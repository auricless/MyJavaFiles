import java.util.Scanner;

public class DynamicMultiTable {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		
		printMultiTable(num);

	}
	
	public static void printMultiTable(int num) {
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				if(i*j > 9) {
					System.out.print(" " + i * j);
				}else {
					System.out.print(" " + i * j + " ");
				}
			}
			System.out.println();
		}
	}

}
