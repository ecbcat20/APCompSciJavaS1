package penClasses;

public class Pen {
	
	@SuppressWarnings("unused")
	private String type;
	
	@SuppressWarnings("unused")
	private int point;
	
	@SuppressWarnings("unused")
	private String color;
	
	private boolean isClicked;
	
	public Pen() {
		
	}
	
	public Pen(String type, int point, String color, boolean isClicked) {
		this.type = type; this.color = color;
		this.isClicked = false;
	}
	
	public void click() {

		isClicked = !isClicked;
	}
	
	public void setColor(String c) {

		color = c;
	}
	
	public void setPoint(int p) {

		point = p;
	}
	
	public void setType(String t) {

		type = t;
	}

	public String toString() {
		return ("Type " + type + " Point: " + point + " Color: " + color + " " + " Is Clicked? "  + isClicked);
	}

}
