package challenges;

import java.util.Scanner;

public class RockPaperScissors {

	static String userMove;
	static Scanner scanner = new Scanner(System.in);
	static String[] pcMoves = {"Rock", "Paper", "Scissors" };
	static int random = (int)(Math.random() * 2 + 1);
	static boolean winCondition;

	static int userWins, computerWins;

	@SuppressWarnings("static-access") //no warnings please!
	public RockPaperScissors(String userMove) {
		this.userMove = userMove;
	}

	//user move input loop
	public String userMove(RockPaperScissors moveChosen) {
		if(userMove.equalsIgnoreCase("rock")) {
			userMove = "rock";
		} else if(userMove.equalsIgnoreCase("paper")) {
			userMove = "paper";
		} else if(userMove.equalsIgnoreCase("scissors")) {
			userMove = "scissors";
		} else if(userMove.equalsIgnoreCase("exit")) 
			userMove = "exit";
		System.out.println("You Chose: " + userMove);
		return userMove;
	}


	//computer move decision loop
	public String[] pcMoves() {
		System.out.println(pcMoves[random]);
		return pcMoves;
	}

	boolean winCondition() {

		//rock
		if(pcMoves[random] == "rock" && userMove == "paper") {
			userWins++;
			winCondition = true;
		} else if(pcMoves[random] == "rock" && userMove == "scissors") {
			computerWins++;
			winCondition = false;
		} else if(pcMoves[random] == "rock" && userMove == "rock") {

			//paper
		} else if(pcMoves[random] == "paper" && userMove == "scissors") {
			userWins++;
			winCondition = true;
		} else if(pcMoves[random] == "paper" && userMove == "paper") {
		} else if(pcMoves[random] == "paper" && userMove == "rock") {
			computerWins++;
			winCondition = false;

			//scissors
		} else if(pcMoves[random] == "scissors" && userMove == "rock") { 
			userWins++;
			winCondition = true;
		} else if(pcMoves[random] == "scissors" && userMove == "paper") {
			computerWins++;
			winCondition = false;
		} else if(pcMoves[random] == "scissors" && userMove == "scissors") {

			//exit condition
		} else if(userMove == "exit") {
			System.out.println(userWins);
			System.out.println(computerWins);
			System.exit(10);
		}
		return winCondition;
	}

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RockPaperScissors moveChosen = new RockPaperScissors(userMove);

		do {
			System.out.println("Rock, Paper, or Scissors?: ");
			userMove = scanner.nextLine();

			moveChosen.userMove(moveChosen);
			moveChosen.pcMoves();
			moveChosen.winCondition();
			
			if(winCondition == true) {
				System.out.println("You have won! ");
			} else if (winCondition == false) {
				System.out.println("You lost. ");
			}
			
			
		} while(userMove != "exit");



	}

}
