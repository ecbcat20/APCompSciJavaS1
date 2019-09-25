package stringBasics;

import java.util.Scanner;

public class ShorthandNoReplace {

	public ShorthandNoReplace(String s) {

	}

	//all strings
	static String s1 = "you can pretend to be serious; you can't pretend to be witty";
	static String s2 = "for FOR to you YOU and TO and";
	static String s3 = "Humuhumunukunukuapua'a - Hawaiian State Fish";
	static String s4 = "2+2=4";
	static String s5 = "This is FOR YOU TO try AND convert";

	static String selection; //selection

	static int length1, length2, length3, length4, length5;

	static Scanner scanner = new Scanner(System.in); //declare scanner

	static int i = 1; //ticker for do-while loop

	void string1() {
		try {

			s1 = s1.substring(0, s1.indexOf("you")) + "u" + s1.substring((s1.indexOf("you"))+3, s1.length());

			s1 = s1.substring(0, s1.indexOf("to")) + "2" + s1.substring((s1.indexOf("to")+2), s1.length());
			s1 = s1.substring(0, s1.indexOf("you")) + "u" + s1.substring((s1.indexOf("you")+2), s1.length());

			s1 = s1.substring(0, s1.indexOf("to")) + "2"+ s1.substring((s1.indexOf("to"))+2, s1.length());

			System.out.println(s1);

		} catch (Exception e) {
			System.out.println("Outofboundserror");
		}

	}

	void string2() {

		try {
			s2 = s2.substring(0, s2.indexOf("you")) + "u" + s2.substring((s2.indexOf("you"))+3, s2.length());

			s2 = s2.substring(0, s2.indexOf("to")) + "2" + s2.substring((s2.indexOf("to")+2), s2.length());
			s2 = s2.substring(0, s2.indexOf("you")) + "u" + s2.substring((s1.indexOf("you")+2), s2.length());
			s2 = s2.substring(0, s2.indexOf("to")) + "2"+ s2.substring((s2.indexOf("to"))+2, s2.length());

			System.out.println(s2);

		} catch (Exception e) {
			System.out.println("Outofboundserror");
		}

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

			ShorthandNoReplace string1 = new ShorthandNoReplace(s1); //create objects
			ShorthandNoReplace string2 = new ShorthandNoReplace(s2);
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

			case "Q": System.exit(10); //exit
			break;

			} 

		} while(i==1); //always, essentially.

		scanner.close(); //close scanner 

	}
}
