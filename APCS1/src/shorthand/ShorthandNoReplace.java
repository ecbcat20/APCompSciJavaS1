package shorthand;

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
	static Scanner scanner = new Scanner(System.in); //declare scanner

	static int i = 1; //ticker for do-while loop

	void string1() {
		try {

			s1 = s1.substring(0, s1.indexOf("you")) + "u" + s1.substring((s1.indexOf("you"))+3, s1.length());
			s1 = s1.substring(0, s1.indexOf("to")) + "2" + s1.substring((s1.indexOf("to")+2), s1.length());

			s1 = s1.substring(0, s1.indexOf("you")) + "u" + s1.substring((s1.indexOf("you")+3), s1.length());
			s1 = s1.substring(0, s1.indexOf("to")) + "2"+ s1.substring((s1.indexOf("to"))+2, s1.length());

			System.out.println(s1);

		} catch (Exception e) {
			System.out.println("Outofboundserror");
		}

	}

	void string2() {

		try {
			s2 = s2.substring(0, s2.indexOf("you")) + "u" + s2.substring((s2.indexOf("you")+3), s2.length());
			s2 = s2.substring(0, s2.indexOf("to")) + "2" + s2.substring((s2.indexOf("to")+2), s2.length());
			s2 = s2.substring(0, s2.indexOf("for")) + "4" + s2.substring((s2.indexOf("for")+3), s2.length());
			s2 = s2.substring(0, s2.indexOf("for")) + "4" + s2.substring((s2.indexOf("for")+3), s2.length());
			s2 = s2.substring(0, s2.indexOf("you")) + "u" + s2.substring((s2.indexOf("you")+3), s2.length());
			s2 = s2.substring(0, s2.indexOf("to")) + "2" + s2.substring((s2.indexOf("to")+2), s2.length());
			s2 = s2.substring(0, s2.indexOf("and")) + "&" + s2.substring((s2.indexOf("and")+3), s2.length());
			s2 = s2.substring(0, s2.indexOf("and")) + "&" + s2.substring((s2.indexOf("and")+3), s2.length());



			System.out.println(s2);

		} catch (Exception e) {
			System.out.println("Outofboundserror");
		}

	}

	void string3() {
		try {
			s3 = s3.substring(0, s3.indexOf("you")) + "u" + s3.substring((s3.indexOf("you"))+3, s3.length());
			s3 = s3.substring(0, s3.indexOf("to")) + "2" + s3.substring((s3.indexOf("to")+2), s3.length());

			s3 = s3.substring(0, s3.indexOf("you")) + "u" + s3.substring((s3.indexOf("you")+3), s3.length());
			s3 = s3.substring(0, s3.indexOf("to")) + "2"+ s3.substring((s3.indexOf("to"))+2, s3.length());

			System.out.println(s3);

		} catch (Exception e) {
			System.out.println("Outofboundserror");
		}


	}

	void string4() {
		try {
			s4 = s4.substring(0, s4.indexOf("you")) + "u" + s4.substring((s4.indexOf("you"))+3, s4.length());
			s4 = s4.substring(0, s4.indexOf("to")) + "2" + s4.substring((s4.indexOf("to")+2), s4.length());

			s4 = s4.substring(0, s4.indexOf("you")) + "u" + s4.substring((s4.indexOf("you")+2), s4.length());
			s4 = s4.substring(0, s4.indexOf("to")) + "2"+ s4.substring((s4.indexOf("to"))+2, s4.length());

			System.out.println(s4);

		} catch (Exception e) {
			System.out.println("Outofboundserror");
		}

	}

	void string5() {
		try {
			s5 = s5.substring(0, s5.indexOf("for")) + "4" + s5.substring((s5.indexOf("for"))+3, s5.length());
			s5 = s5.substring(0, s5.indexOf("you")) + "u" + s5.substring((s5.indexOf("you"))+3, s5.length());
			s5 = s5.substring(0, s5.indexOf("to")) + "2" + s5.substring((s5.indexOf("to")+2), s5.length());
			s5 = s5.substring(0, s5.indexOf("and")) + "&" + s5.substring(s5.indexOf("and")+3, s5.length());

			System.out.println(s5);

		} catch (Exception e) {
			System.out.println("Outofboundserror");
		}

	}


	public static void main(String[] args) {

	}
}
