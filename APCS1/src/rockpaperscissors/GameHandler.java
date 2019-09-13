package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class GameHandler {

	//main variables
	static String userMove;
	static String[] computerMove = {"R", "P", "S"};

	//random
	static int random = new Random().nextInt(3);

	//scanner
	static Scanner scanner = new Scanner(System.in);



	public static void main(String[] args) {
		
		System.out.println("R/P/S");
		userMove = scanner.next();
		
		if(userMove.equalsIgnoreCase("R") && computerMove[random] == "R") {
			System.out.println("Tie");
		}
		
		if(userMove.equalsIgnoreCase("R") && computerMove[random] == "P") {
			System.out.println("Loss");
		}
		
		if(userMove.equalsIgnoreCase("R") && computerMove[random] == "S") {
			System.out.println("Win");
		}
		
		//paper
		if(userMove.equalsIgnoreCase("P") && computerMove[random] == "R") {
			System.out.println("Win");
		}
		
		if(userMove.equalsIgnoreCase("P") && computerMove[random] == "P") {
			System.out.println("Tie");
		}
		
		if(userMove.equalsIgnoreCase("P") && computerMove[random] == "S") {
			System.out.println("Loss");
		}


	}

}





