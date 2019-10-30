package mpg;

public class ParklingLaunch {

	public static void main(String[] args) {

		// instantiate ParkingLot
		ParkingLot lot = new ParkingLot();

		// instantiate cars
		Car car1 = new Car(20);
		Car car2 = new Car(20);
		Car car3 = new Car(20);

		// add each car to lot
		lot.add(car1, "car1");
		lot.add(car2, "car2");
		lot.add(car3, "car3");

		// print contents of lot
		System.out.println("Parking Lot Contains: ");
		System.out.println(lot.returnParked());

		// fill up each car
		car1.fillUp(300, 10);
		car2.fillUp(400, 10);
		car3.fillUp(500, 20);

		// find mpg of each car
		double mpg1 = car1.calculateMPG();
		double mpg2 = car2.calculateMPG();
		double mpg3 = car3.calculateMPG();

		// find and print mpg of entire lot
		System.out.println("\n" + "Average MPG of Lot: " + lot.returnMPG() + " MPG");

		// print mpg of each car
		System.out.println();
		System.out.println("car1: " + mpg1);
		System.out.println("car2: " + mpg2);
		System.out.println("car3: " + mpg3);

		// change fill value of car1
		car1.fillUp(600, 10);
		System.out.println("\n" + "New MPG of car1: " + car1.calculateMPG() + " MPG");

		// find mpg after fill and print
		System.out.println("Average MPG of New Lot: " + lot.returnMPG() + " MPG");

	}

}
