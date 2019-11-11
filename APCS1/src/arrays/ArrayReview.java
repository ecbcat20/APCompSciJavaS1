package arrays;

public class ArrayReview {

	public static void main(String[] args) {

		int[] array = new int[10];
		int sum = 0;

		System.out.println("INT ARRAY");

		for (int i = 0; i < 10; i++) {
			int ran = (int) (Math.random() * 10);
			array[i] = ran;
			System.out.print(array[i] + " " + "SUM TOTAL: ");
			sum += array[i];
			System.out.println(sum);
		}

		String[] sArray = { "Peter", "Benjamin", "Joshua", "Matthew", "Randomname" };

		System.out.println("\n" + "STRING ARRAY FORWARDS");
		for (int i = 0; i < 5; i++) {
			System.out.print(sArray[i] + " ");
		}

		System.out.println();

		System.out.println("\n" + "STRING ARRAY BACKWARDS");

		for (int i = 4; i >= 0; i--) {
			System.out.print(sArray[i] + " ");
		}

		int[] avgArray = { 6, 5, 8, 3, 9, 1, 0, 3, 4, 2, 9, 7, 6, 8, 4, 9 };
		int sumofAvgArray = 0;
		for (int i = 0; i < 16; i++) {
			sumofAvgArray += avgArray[i];
		}

		System.out.println();

		System.out.println("\n" + "SUM OF ARRAY: " + sumofAvgArray);
		double average = ((sumofAvgArray) / 16);
		System.out.println("AVERAGE OF ARRAY: " + average);

	}

}
