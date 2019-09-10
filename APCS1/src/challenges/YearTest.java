package challenges;

import java.util.Scanner;

public class YearTest {


	//class constructor for YearTest, parameter of integer year
	public YearTest(int yearIn) {
		this.yearIn = yearIn;
	}

	//declare global variables
	static int yearIn;


	static boolean isDivisibleFour;
	static boolean isDivisibleHundred;
	static boolean isDivisibleFourH;
	static boolean isLeapYear;

	//declare scanner
	static Scanner scanner = new Scanner(System.in);

	static boolean isDivisibleFour() { //potentially change to if(year % 4 != 0)
		if(yearIn % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	boolean isDivisibleHundred() {
		if(yearIn % 100 == 0) {
			return true;
		} else  {
			return false;
		}
	}

	static boolean isDivisibleFourH() {
		if(yearIn % 400 == 0) {
			return true;
		} else  {
			return false;
		} 
	}

	static void isLeapYear() {
		if (isDivisibleFour() == true && !isDivisibleFourH() == true) {
			System.out.println(true);
	
		}

		if (yearIn <= 1582) {
			System.out.println("Your year was before 1582. Please input a different year: ");
	

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


		isLeapYear();

	}
}

