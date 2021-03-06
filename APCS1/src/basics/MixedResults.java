package basics;

import java.util.Scanner;

public class MixedResults {

	static double d1 = 37.9; // Initialize these variables at the top of your program
	static double d2 = 1004.128;
	static int i1 = 12;
	static int i2 = 18;

	static int selection;

	static Scanner scannerFunctionSelector = new Scanner(System.in); // open scanner
	static int count = 0; // initialize counter for selectorTool()

	// case 1
	public static void testerFunction1() {

		// 57.2 x (i1 / i2) + 1
		System.out.println((57.2) * (i1 / i2) + 1);
	}

	// case 2
	public static void testerFunction2() {

		// same formula except cast i1 as double
		double i1d = i1;
		System.out.println((57.2) * i1d / i2 + 1);

	}

	// case 3
	public static void testerFunction3() {

		// 15 – i1 x (d1 x 3) + 4
		System.out.println((15) - (i1 * (d1 * 3)) + 4);

	}

	// case 4
	public static void testerFunction4() {

		// same formula except cast product of d1x3 as integer
		int productOf3d = (int) (d1 * 3);
		System.out.println((15) - (i1 * (productOf3d)) + 4);

	}

	// case 5
	public static void testerFunction5() {

		// same formula except cast d1 as integer
		int d1d = (int) d1;
		System.out.println((15) - (i1 * (d1d * 3)) + 4);

	}

	public static void main(String[] args) {

		// run 5 times
		do {
			MixedResultsSelection.main(args);
		} while (count <= 4);

	}
}
