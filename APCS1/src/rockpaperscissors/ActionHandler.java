package rockpaperscissors;

import java.util.Scanner;

public class ActionHandler {

Scanner scanner = new Scanner(System.in);

	public String userMove() {
		System.out.println("Rock, Paper, or Scissors?");
		return GameHandler.userMove = scanner.nextLine();
	}
	

	
	//main method
	public static void main(String[] args) {

	

	}

}