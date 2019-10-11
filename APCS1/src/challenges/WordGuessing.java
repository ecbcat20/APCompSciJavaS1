package challenges;

import java.util.Scanner;

public class WordGuessing {

	static String hiddenWord = "HARPS";
	static String guess;

	@SuppressWarnings("static-access")
	public WordGuessing(String hiddenWord) {
		this.hiddenWord = hiddenWord;
	}

	String guess(String guess) {
		String returned = "";

		for(int i = 0; i<guess.length(); i++) {
			if(guess.charAt(i) == hiddenWord.charAt(i)) {
				returned = returned + hiddenWord.substring(i, i+1);
				System.out.println(returned);

			} else {
				returned = returned + "*";
				System.out.println(returned);
			}


		}

		return returned;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("input your guess");
		guess = scanner.next();

		WordGuessing guessed = new WordGuessing(hiddenWord);
		guessed.guess(guess);
		System.out.println();

		scanner.close();



	}

}
