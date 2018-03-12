
public class PrimeNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		int count = 0;

		for(int i = 1; i <= 1000; i++) {
			int factors = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					factors += 1;
				}
			}
			
			if(i % 1 == 0 && i % i == 0 && factors == 2) {
				System.out.println(i + " is a prime number");
				sum += i;
				count++;
			}
		}
		
		System.out.println(count);
		System.out.println(sum);

	}

}
