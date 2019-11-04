package penClasses;

public class Main {

	public static void main(String[] args) {

		Pen p = new Pen();
		p.setColor("blue");
		p.setType("gel");
		p.setPoint(7);
		p.click();

		System.out.println(p.click());
		System.out.println(p.click());
		System.out.println(p.click());
		System.out.println(p.click());

		System.out.println(p.toString());
	}

}
