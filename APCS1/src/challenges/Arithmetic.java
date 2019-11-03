package challenges;

public class Arithmetic {

	/**
	 * @param args
	 */

	public static void addAndSubtract() {
		int num1, num2;
		num1 = 4;
		num2 = 5;

		int answerAdd = num1 + num2;
		int answerSubtract = num1 - num2;

		System.out.println("Addition: " + answerAdd);
		System.out.println("Subtraction: " + answerSubtract);

	}

	public static void multiplyAndDivide() {
		double number1, number2;
		number1 = 3;
		number2 = 5;

		double answerMult = number1 * number2;
		double answerDiv = number1 / number2;

		System.out.println("\n" + "Multiplication: " + answerMult);
		System.out.println("Division: " + answerDiv);
	}

	public static void doubleArithmetic() {
		double numero1, numero2;
		numero1 = 3.2;
		numero2 = 6.1;

		double add = numero1 + numero2;
		double sub = numero1 - numero2;
		double mult = numero1 * numero2;
		double div = numero1 / numero2;

		System.out.println("\n" + "3.2 + 6.1 = " + add);
		System.out.println("3.2 - 6.1 = " + sub);
		System.out.println("3.2 x 6.1 = " + mult);
		System.out.println("3.2 / 6.1 = " + div);
	}

	// default double value = null

	public static void booleanTest() {
		boolean variable1, variable2;
		// default boolean value = null

		variable1 = true;
		variable2 = false;

		if (variable1 && variable2 == true || variable1 || variable2 == true) {
			System.out.println("\n" + "true");
		}

		if (variable1 != variable2) {
			System.out.println("false");

		} else {
			System.out.println("heck");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addAndSubtract();
		multiplyAndDivide();
		doubleArithmetic();
		booleanTest();

	}

}

/*
 * Addition: 9 Subtraction: -1
 * 
 * Multiplication: 15.0 Division: 0.6
 * 
 * 3.2 + 6.1 = 9.3 3.2 - 6.1 = -2.8999999999999995 3.2 x 6.1 = 19.52 3.2 / 6.1 =
 * 0.5245901639344263
 * 
 * true false
 */
