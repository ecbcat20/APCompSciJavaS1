package forLoopPractice;

public class PrintTrianglesReversed {

	public static void printTrianglesReverse() {
		for (int k = 10; k >= 1; k--) { // master for loop

			for (int m = 1; m <= k; m++) { // loop for determining how many stars to print
				System.out.print("*");
			}

			System.out.println(" "); // reset console to new fresh line
		}
	}

	public static void main(String[] args) {
		printTrianglesReverse(); // run reverse triangle method

	}

}
