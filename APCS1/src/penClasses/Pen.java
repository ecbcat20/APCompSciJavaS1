package penClasses;

public class Pen {
	
	private String type;
	private int point;
	private String color;
	private boolean isClicked = false;
	
	public Pen() {
		
	}
	
	public Pen(String type, int point, String color, boolean isClicked) {
		this.type = type; this.color = color;
		this.isClicked = isClicked;
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

}
