package challenges;

import java.util.Scanner;

public class YearTest {

	//declare global variables
	static int year;
	static int yearIn;
	static boolean isDivisibleFour;
	static boolean isDivisbleHundred;
	static boolean isDivisbleFourH;
	boolean isLeapYear;

	//declare scanner
	static Scanner scanner = new Scanner(System.in);

	//class constructor for YearTest, parameter of integer year
	public YearTest(int year) {

	}

	boolean isDivisibleFour() { //potentially change to if(year % 4 != 0)
		if(year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	boolean isDivisibleHundred() {
		if(year % 100 == 0) {
			return true;
		} else  {
			return false;
		}
	}

	boolean isDivisibleFourH() {
		if(year % 400 == 0) {
			isDivisbleFourH = true;
			return true;
		} else  {
			return false;
		}
	}

	boolean isLeapYear() {
		if (isDivisibleFour() == true) {
			isLeapYear = true;
			return true;
		} else if (isDivisibleHundred() == true && isDivisibleFourH() == false) {
			isLeapYear = false;
			return false;
		} else {
			return isLeapYear;
		}
	}

	//main method
	public static void main(String[] args) {


		//get user input
		System.out.println("Welcome to the leap year calculator. Please input a year: ");
		int yearIn = scanner.nextInt();
		System.out.println("You have entered: " + yearIn);

		//declare year
		YearTest year = new YearTest(yearIn);

		//if-then statement for single check
		if(year.isLeapYear == true) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}

