package challenges;

import java.util.Scanner;

public class MultipleMath {

	//initialize variables
	static float fIn; //temperature in
	static int a; //a in pythagoras
	static int i = 1; // constant
	static int b; //b in pythagoras
	static double rad; //radius in volume
 
	//initialize equation variables
	static String equation;
	int equationSelected;

	static Scanner scanner = new Scanner(System.in); //open scanner

	//temperature calculator
	public static void temperature() {
		System.out.println((5*(fIn - 32)/9));
	}

	//volume calculator
	public static void volume() {
		double volume = ((4/3) * Math.PI * (rad * rad * rad));
		System.out.println(volume);
	}

	//Pythagorean theorem calculator for c
	public static void pythagoras(int a, int b) {
		double pythagoras = (Math.sqrt((a*a) + (b*b)));
		System.out.println(pythagoras); //return to main
	}

	//main method
	public static void main(String[] args) {

		do { //do-while loop

			System.out.println("Please enter your equation: (Temperature, Volume, Pythagoras: ");
			equation = scanner.nextLine();

			if(equation.equalsIgnoreCase("Temperature") ) {
				System.out.println("Enter your Fahrenheit Value");
				fIn = (float) scanner.nextDouble();
				temperature();

			} else if(equation.equalsIgnoreCase("Volume")) {
				rad = scanner.nextInt();
				volume();

			} else if(equation.equalsIgnoreCase("Pythagoras")) {
				System.out.println("Enter your value for a: ");
				a = scanner.nextInt();
				System.out.println("Enter your value for b: ");
				b = scanner.nextInt();
				pythagoras(a, b);
			} else {
				System.out.println("No valid input: ");
			}

			scanner.close(); //close scanner

		} while (i == 1); //always

	}

}
