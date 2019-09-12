package challenges;

import java.util.Scanner;

public class MultipleMath {
	
	static double fIn;
	static int a;
	static int b;
	static String equation;
	int equationSelected;
	static double rad;
	
	static Scanner scanner = new Scanner(System.in);
	
	@SuppressWarnings("static-access")
	public MultipleMath(int fIn, int a, int b, String equation) {
		this.fIn = fIn; this.a = a; this.b = b; this.equation = equation;
	}
	
	static double temperature() {
		double temperature = ((5/9) * (fIn + (-32)));
		System.out.println(temperature);
		return temperature;
	}
	
	static double volume() {
		double volume = ((4/3) * Math.PI * (rad * rad * rad));
		System.out.println(volume);
		return volume;
	}
	
	static double pythagoras(int a, int b) {
		double pythagoras = (Math.sqrt((a*a) + (b*b)));
		System.out.println(pythagoras);
		return pythagoras;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("Please enter your equation: (Temperature, Volume, Pythagoras: ");
		equation = scanner.nextLine();
		
		if(equation.equalsIgnoreCase("Temperature") ) {
			System.out.println("Enter your Fahrenheit Value");
			fIn = scanner.nextDouble();
			temperature();
		} else if(equation.equalsIgnoreCase("Volume")) {
			rad = scanner.nextInt();
			volume();
		} else if(equation.equalsIgnoreCase("Pythagoras")) {
			System.out.println("Enter your value for a: ");
			a = scanner.nextInt();
			System.out.println("Enter your value for b: ");
			b = scanner.nextInt();
			pythagoras(a, b);
		}
		
  
		
	}

}
 