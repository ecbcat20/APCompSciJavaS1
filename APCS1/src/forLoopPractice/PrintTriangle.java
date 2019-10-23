package forLoopPractice;

class PrintTriangle {

	public static void printTriangles() {
		for (int k = 1; k <= 6; k++) { // master for loop

			for (int m = 0; m < k; m++) { // loop for determining how many stars to print
				System.out.print("*");
			}

			System.out.println(" "); // reset console to new fresh line
		}
	}

	public static void main(String[] args) {
		printTriangles(); // execute method printTriangles();
	}
}