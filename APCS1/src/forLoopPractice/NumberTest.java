package forLoopPractice;

public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// loop for printing all odd numbers
		for (int i = 100; i <= 1000; i++) {
			if (i % 2 == 1) {
				System.out.println("Odd Number: " + i);
			}

		}

		// declare sum to be 0
		int sum = 0;
		for (int j = 100; j <= 1000; j++) {
			sum += j; // add sum to j

		}

		System.out.println("Sum of all even numbers: " + sum); // print sum of all even numbers

	}
}
