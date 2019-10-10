package challenges;

import java.util.Scanner;

public class WordGuessing {

	String hiddenWord = "HARPS";
	static String returned = "";
	static String guess;

	public WordGuessing(String hiddenWord) {
		this.hiddenWord = hiddenWord;
	}

	String guess(String guess) {

		for(int i = 0; i<hiddenWord.length(); i++) {
			
			if(guess == hiddenWord) {
				returned = hiddenWord;
			} if(guess.charAt(i) == hiddenWord.charAt(i)) {
				returned += returned.charAt(i);
			} else if(guess.charAt(i)!=hiddenWord.charAt(i)){
				returned += "+";
			}
		}

		return returned;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("input your guess");
		guess = scanner.next();

		WordGuessing guessed = new WordGuessing(guess);
		guessed.guess(guess);
		System.out.println(returned);

		scanner.close();



	}

}
