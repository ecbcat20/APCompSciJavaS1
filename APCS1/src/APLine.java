
public class APLine {

	//initialize variables
	int a, b, c;
	int x, y;
	double slope;
	boolean isOnLine;

	// constructor for APLine
	public APLine(int a, int b, int c) {
		this.a = a; this.b = b; this.c = c;
	}

	//getSlope() method
	double getSlope() {	
		return slope = ((-1*b)/a);

	}

	//isOnLine() method
	boolean isOnLine(int x, int y) {
		this.x = x; this.y = y;

		if (a*x + b*y == 0) { //formula for finding if equal 0
			isOnLine = true;
			System.out.println(isOnLine);
			return isOnLine; //return true
		} else {
			isOnLine = false;	
			System.out.println(isOnLine);
			return isOnLine; //return false
		} 

	}


	public static void main(String[] args) {


		APLine line1 = new APLine(5, 4, -17); //create new line1
		line1.getSlope(); //get slope of line1
		line1.isOnLine(5, -2); //calculate if points are on line1

		APLine line2 = new APLine(-25, 40, -17); //create new line2
		line2.getSlope(); //get slope of line2
		line2.isOnLine(5, -2); //calculate if points are on line2

		System.out.println(line1.slope); //print slope of line1
		System.out.println(line2.slope); //print slope of line2


		//output of program
		
		/* false
		false
		0.0
		1.0
		*/




	}

}

