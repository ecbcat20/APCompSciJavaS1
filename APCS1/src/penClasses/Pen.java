package penClasses;

public class Pen {

	private String type;
	private int point;
	private String color;
	private boolean isClicked;

	// default constructor
	public Pen() {

	}

	// secondary constructor
	public Pen(String type, int point, String color, boolean isClicked) {
		this.type = type;
		this.color = color;
		this.isClicked = false;
	}

	// click pen
	public boolean click() {

		isClicked = !isClicked;
		return isClicked;
	}

	// set color of pen
	public void setColor(String c) {

		color = c;
	}

	// set size of pen tip
	public void setPoint(int p) {

		point = p;
	}

	// set type of pen
	public void setType(String t) {

		type = t;
	}

	// print pen and its attributes
	public String toString() {
		return ("Type " + type + " Point: " + point + " Color: " + color + " " + " Is Clicked? " + isClicked);
	}

}
