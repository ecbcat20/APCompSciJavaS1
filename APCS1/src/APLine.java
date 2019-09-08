
public class APLine {

	int a, b, c;
	int x, y;
	double slope;
	boolean isOnLine;

	public APLine(int a, int b, int c) {
		this.a = a; this.b = b; this.c = c;
	}

	double getSlope() {	
		return slope = ((-1*b)/a);

	}

	boolean isOnLine(int x, int y) {
		this.x = x; this.y = y;
		
		if (a*x + b*y == 0) {
			isOnLine = true;
			System.out.println(isOnLine);
			return isOnLine;
		} else {
			isOnLine = false;	
			System.out.println(isOnLine);
			return isOnLine;
		} 

	}


	public static void main(String[] args) {


		APLine line1 = new APLine(5, 4, -17);
		double slope1 = line1.getSlope();
		line1.isOnLine(5, -2);

		APLine line2 = new APLine(-25, 40, -17);
		double slope2 = line2.getSlope();
		line2.isOnLine(5, -2);

		System.out.println(slope1);
		System.out.println(slope2);






	}

}

