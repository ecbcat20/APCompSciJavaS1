package mpg;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("New car initialized at: ");
		int o = scanner.nextInt();
		Car auto = new Car(o);

		System.out.print("Filling Station Visit: ");
		int m, g;
		System.out.println("odometer reading: ");
		m = scanner.nextInt();
		
		System.out.println("gallons to fill tank: ");
		g = scanner.nextInt();
		
		auto.fillUp(m, g);

		System.out.println("Calculating MPG: ");
		System.out.print(auto.calculateMPG());
		scanner.close();

	}

}
