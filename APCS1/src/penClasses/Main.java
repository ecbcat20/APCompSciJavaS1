package penClasses;

public class Main {

	public static void main(String[] args) {

		// instantiate new pen object
		Pen p = new Pen();

		// set pen color
		p.setColor("blue");

		// set pen type
		p.setType("gel");

		// set pen point
		p.setPoint(7);

		// click pen
		p.click(); // true

		// click 4 times: false, true, false, true
		System.out.println(p.click());
		System.out.println(p.click());
		System.out.println(p.click());
		System.out.println(p.click());

		// output pen and its attributes
		System.out.println(p.toString());
	}

}
