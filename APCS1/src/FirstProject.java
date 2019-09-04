import java.util.Scanner;

public class FirstProject {

	//declare scanner
	static Scanner scanner = new Scanner(System.in);
	
	//declare global variables
	static int radius;
	static double volume;
	static double surfaceArea;
	static double pie = Math.PI;

	
	public static void volumeFinder () {

		// volume formula = 4/3(pi)r^3
		//get user input for radius
		System.out.println("Input Radius: ");
		radius = scanner.nextInt();
		
		//output final volume
		volume = (pie*(radius * radius * radius)*(4)/3);
		System.out.println("Your Volume is: " + volume + " Cubic Units.");
		
	}
	
	
	public static void surfaceFinder() {
		
		// surface area formula = 4*pi*r^2
		surfaceArea = (4*pie*(radius * radius));
		
		//print final
		System.out.println("Your Surface Area is: " + surfaceArea + " Units Squared");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		volumeFinder();
		surfaceFinder();
		
		
	}

}
