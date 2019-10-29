package mpg;

import java.util.ArrayList;

public class ParkingLot {

	private String location;
	double avgMPG;

	ArrayList<Car> parked = new ArrayList<Car>();
	ArrayList<String> vrooms = new ArrayList<String>();

	// default constructor
	public ParkingLot() {

	}

	// secondary constructor
	public ParkingLot(Car car, String location) {
		this.location = location;
		parked.add(car);

	}

	public void add(Car car, String alias) {
		parked.add(car);
		vrooms.add(alias);
	}

	ArrayList<String> returnParked() {
		return vrooms;
	}

	double returnMPG(double mpg1, double mpg2, double mpg3) {
		double MPG = ((mpg1 + mpg2 + mpg3) / 3);
		return MPG;
	}

	String getLocation() {
		return location;
	}

	double calcAverageMPG() {
		return avgMPG;
	}

}
