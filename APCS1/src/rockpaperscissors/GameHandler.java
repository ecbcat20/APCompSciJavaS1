package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class GameHandler {

	// main variables
	static String userMove;
	static String[] computerMove = { "R", "P", "S" };

	// random
	static int random = new Random().nextInt(3);

	// scanner
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// run main game class
		ActionHandler.game();

	}

}
