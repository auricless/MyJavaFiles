import java.util.Scanner;

public class DynamicTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int height = in.nextInt();
		
		printDynamicTriangle(height);
	}
	
	public static void printDynamicTriangle(int height) {
//		int ast = 1;
//		int space = height - 1;
//		
//		for(int i = 0; i < height; i++) {
//			for(int j = space; j > 0; j--) {
//				System.out.print("-");
//			}
//			for(int k = 0; k < ast; k++) {
//				System.out.print("*");
//			}
//			ast += 2;
//			space --;
//			System.out.println();
//		}
		
		int length = ((height * 2) - 1);
		int center = height - 1;
		
		char arr[] = new char[length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ' ';
		}
		
		for(int i = 0; i < height; i++) {
			int starStart = center - i;
			int starEnd = center + i;
			arr[starStart] = '*';
			arr[starEnd] = '*';
			System.out.println(new String(arr));
		}
	}

}
