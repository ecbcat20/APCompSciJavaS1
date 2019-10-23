package rockpaperscissors;

import java.util.Scanner;

public class ActionHandler {

	Scanner scanner = new Scanner(System.in);

	public static void game() {

		do {
			System.out.println("Rock/Paper/Scissors" + " (R/P/S)"); // clarify valid inputs

			GameHandler.userMove = GameHandler.scanner.next(); // get user input

			// rock
			if (GameHandler.userMove.equalsIgnoreCase("R") && GameHandler.computerMove[GameHandler.random] == "R") {
				System.out.println("Tie");
				WinCounter.ties++; // increase tie counter
			}

			if (GameHandler.userMove.equalsIgnoreCase("R") && GameHandler.computerMove[GameHandler.random] == "P") {
				System.out.println("Loss");
				WinCounter.losses++; // increase loss counter
			}

			if (GameHandler.userMove.equalsIgnoreCase("R") && GameHandler.computerMove[GameHandler.random] == "S") {
				System.out.println("Win");
				WinCounter.wins++; // increase win counter
			}

			// paper
			if (GameHandler.userMove.equalsIgnoreCase("P") && GameHandler.computerMove[GameHandler.random] == "R") {
				System.out.println("Win");
				WinCounter.wins++;
			}

			if (GameHandler.userMove.equalsIgnoreCase("P") && GameHandler.computerMove[GameHandler.random] == "P") {
				System.out.println("Tie");
				WinCounter.ties++;
			}

			if (GameHandler.userMove.equalsIgnoreCase("P") && GameHandler.computerMove[GameHandler.random] == "S") {
				System.out.println("Loss");
				WinCounter.losses++;
			}

			// scissors
			if (GameHandler.userMove.equalsIgnoreCase("S") && GameHandler.computerMove[GameHandler.random] == "S") {
				System.out.println("Tie");
				WinCounter.ties++;
			}

			if (GameHandler.userMove.equalsIgnoreCase("S") && GameHandler.computerMove[GameHandler.random] == "R") {
				System.out.println("Loss");
				WinCounter.losses++;
			}

			if (GameHandler.userMove.equalsIgnoreCase("S") && GameHandler.computerMove[GameHandler.random] == "P") {
				System.out.println("Win");
				WinCounter.wins++;
			}

			if (GameHandler.userMove.equalsIgnoreCase("Exit")) {
				WinCounter.printResults();
				System.exit(10);
			}
		} while (GameHandler.userMove != "exit");
	}

	// main method
	public static void main(String[] args) {

	}

}