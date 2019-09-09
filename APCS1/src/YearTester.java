import java.util.Scanner;

public class YearTester {

	static int year;
	boolean isDivisibleFour, isDivisbleHundred, isDivisbleFourH;
	boolean isLeapYear;
	
	static Scanner scanner = new Scanner(System.in);
	
	public YearTester(int year) {

	}

	boolean isDivisibleFour(int year) {
		String year2 = String.valueOf(year);
		if(year % 4 == 0) {
			isDivisibleFour = true;
			return isDivisibleFour;
		} else  {
			return false;
		}
	}
	
	boolean isDivisibleHundred() {
		if(year % 100 == 0) {
			isDivisbleHundred = true;
			return isDivisbleHundred;
		} else  {
			return false;
		}
	}
	
	boolean isDivisibleFourH() {
		if(year % 400 == 0) {
			isDivisbleFourH = true;
			return isDivisbleFourH;
		} else  {
			return false;
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to the leap year calculator. Please input a year: ");
		year = scanner.nextDouble();
		
		System.out.println("You have entered: " + year);
		
		year.isDivisibleFour(year);
		year.isDivisibleHundred();
		year.isDivisibleFourH();
	}

}
