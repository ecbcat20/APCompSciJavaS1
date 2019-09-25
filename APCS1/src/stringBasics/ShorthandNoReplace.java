package stringBasics;

import java.util.Scanner;

public class ShorthandNoReplace {

	//all strings
	static String s1 = "You can pretend to be serious; you can't pretend to be witty";
	static String s2 = "for FOR to you YOU and TO and";
	static String s3 = "Humuhumunukunukuapua'a - Hawaiian State Fish";
	static String s4 = "2+2=4";
	static String s5 = "This is FOR YOU TO try AND convert";

	static String selection; //selection

	static Scanner scanner = new Scanner(System.in); //declare scanner

	static int i = 1; //ticker for do-while loop

	public static void main(String[] args) {
		
		if(s1.contains("you") || s1.contains("to") || s1.contains("and") || s1.contains("for")) {
			s1 = s1.replace("you", "u");
			
			System.out.println(s1);
		}
	
		
	}

}
