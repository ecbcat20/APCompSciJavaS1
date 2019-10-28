package mpg;

public class Car {

	int myStartMiles;
	double myEndMiles;
	@SuppressWarnings("unused")
	private double myGallonsUsed;

	double gallons, odometerReading;

	public Car(int myStartMiles) {
		this.myStartMiles = myStartMiles;
	}

	public Car(int myStartMiles, int myEndMiles, double myGallonsUsed) {
		this.myStartMiles = myStartMiles;
		this.myEndMiles = myEndMiles;
		this.myGallonsUsed = myGallonsUsed;

		myStartMiles = 0;

	}

	String fillUp(int odometerReading, double i) {
		this.odometerReading = odometerReading;
		gallons = i;
		return gallons + " , " + odometerReading;
	}

	double calculateMPG() {
		double MPG;
		myEndMiles = odometerReading - myStartMiles;
		MPG = (myEndMiles / gallons);
		return MPG;
	}

}
