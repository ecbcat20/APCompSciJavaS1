package mpg;

import java.util.ArrayList;

public class ParkingLot {

	private String location;
	double avgMPG;

	ArrayList<Car> parked = new ArrayList<Car>(); // parked cars
	private ArrayList<String> vrooms = new ArrayList<String>(); // aliases of parked cars

	// default constructor
	public ParkingLot() {

	}

	// secondary constructor
	public ParkingLot(Car car, String location) {
		this.location = location;
		parked.add(car);

	}

	// add car to lot and add alias to list of cars
	public void add(Car car, String alias) {
		parked.add(car);
		vrooms.add(alias);
	}

	// create list of aliases of the cars that are parked
	ArrayList<String> returnParked() {
		return vrooms;
	}

	double returnMPG() {
		double MPG = 0;
		for (int i = 0; i < parked.size(); i++) {
			MPG += parked.get(i).calculateMPG();
		}
		MPG = MPG / parked.size();
		return MPG;
	}

	String getLocation() {
		return location;
	}

	double calcAverageMPG() {
		return avgMPG;
	}

}
