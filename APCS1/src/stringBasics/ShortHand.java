package stringBasics;

import java.util.Scanner; //import scanner

public class ShortHand {

	public ShortHand(String s) {

	}

	//all strings
	static String s1 = "You can pretend to be serious; you can't pretend to be witty";
	static String s2 = "for FOR to you YOU and TO and";
	static String s3 = "Humuhumunukunukuapua'a";
	static String s4 = "2+2=4";
	static String s5 = "This is FOR YOU TO try AND convert";

	static String selection; //selection

	static Scanner scanner = new Scanner(System.in); //declare scanner

	static int i = 1; //ticker for do-while loop

	void string1() { //string1
		s1.replace("and", "&");
		s1 = s1.replace("you", "u");
		System.out.println(s1);	
	}

	void string2() { //string2
		s2 = s2.replace("for", "4");
		s2 = s2.replace("to", "2");
		s2 = s2.replace("you", "u");
		s2 = s2.replace("and", "&");
		System.out.println(s2);
	}

	void string3() { //string3
		System.out.println("String 3 is okay"); //nothing to do for string3
	}

	void string4() { //string4
		System.out.println("String 4 is also okay"); //nothing to do for string4 either
	}

	void string5() { //string5
		s5 = s5.replace("for", "4");
		s5 = s5.replace("to", "2");
		s5 = s5.replace("and", "&");
		System.out.println(s5);
	}

	public static void main(String[] args) {

		do {

			System.out.println("\n" + "Enter s1, s2, s3, s4, or s5: "); //make selection
			selection = scanner.next();

			s1 = s1.toLowerCase(); //convert all to lower case
			s2 = s2.toLowerCase();
			s3 = s3.toLowerCase();
			s4 = s4.toLowerCase();
			s5 = s5.toLowerCase();
			
			selection.toLowerCase(); //can exit with q or Q

			ShortHand string1 = new ShortHand(s1); //create objects
			ShortHand string2 = new ShortHand(s2);
			ShortHand string3 = new ShortHand(s3);
			ShortHand string4 = new ShortHand(s4);
			ShortHand string5 = new ShortHand(s5);

			switch(selection) { //switch for running methods

			case "s1": string1.string1(); //s1, run string1
			break;

			case "s2": string2.string2(); //s2, run string2
			break;

			case "s3": string3.string3(); //s3, run string3
			break;

			case "s4": string4.string4(); //s4, run string4
			break;

			case "s5": string5.string5(); //s5, run string5
			break;

			case "q": System.exit(10); //exit
			break;

			} 

		} while(i==1); //always, essentially.

		scanner.close(); //close scanner 

	}
}

