package looping;

import java.util.Scanner;

public class Ramanujan {

	static Scanner scanner = new Scanner(System.in);
	static int one;
	int two;
	int result;
	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
	int[] numbersCubed = {1, 8, 27, 64, 125, 
	
	//1729 
	//smallest number expressible as sum of two cubes
	
	//a^3 + b^3 = c^3 + d^3
	//four nested (for) loops
	
	//print all integers less than or equal to n that can be expressed as the sum of two cubes
	//two different ways
	
	public Ramanujan(int one, int two) {
		this.one = one; this.two = two;
	}
	
	//would need methods to determine how to break up number
	//break up number by cubes
	
	int math(int one) {
		for(int i = 1; i <= 3; i++) {
			if(one % numbers[2] == 0) {
				
			}
			for(int j = 1; j<=4; j++) {
				for(int k = 1; k<=5; k++) {
					for(int m = 1; m<=6; m++) {
						
					}
				}
			}
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {

		System.out.println("Enter your number!: ");
		one = scanner.nextInt();
		
		
	}

}
