package challenges;
import java.util.Scanner;

public class CollegeSelector {

	static String size, tier, region;
	static Scanner scanner = new Scanner(System.in);
	static String selectedCollege;
	static int i = 1;

	//class constructor
	@SuppressWarnings("static-access") //I don't like static access warnings
	public CollegeSelector(String size, String tier, String region) {
		this.size = size; this.tier = tier; this.region = region;
	}

	//check for size
	String size() {
		if(size.equalsIgnoreCase("small")) {
			size = "small";
			return size;
		} else if(size.equalsIgnoreCase("large") || size.equalsIgnoreCase("big")) {
			size = "large";
			return size;
		} return size;
	}

	//check for tier
	String tier() {
		if(tier.equalsIgnoreCase("one")) {
			tier = "one";
			return tier;
		} else if(tier.equalsIgnoreCase("two")) {
			tier = "two";
			return tier;
		} return tier;
	}

	//check for region
	String region() {
		if(region.equalsIgnoreCase("east")) {
			region = "east";
			return region;
		} else if(region.equalsIgnoreCase("west")) {
			region = "west";
			return region;
		} return region;
	}

	//main method
	public static void main(String[] args) {

		System.out.println("Welcome to the College Selector, Courtesy of APCentral! Please Input Your Preferred Size: ");
		size = scanner.nextLine();

		System.out.println("Please Input Your Preferred Tier: ");
		tier = scanner.nextLine();

		System.out.println("Please Input Your Preferred Region (East/West): ");
		region = scanner.nextLine();


		CollegeSelector college = new CollegeSelector(size, tier, region);

		
		//master flow
		do { //do while loop
			if(college.size() == "small" && college.region() == "west" && college.tier() == "one") {
				selectedCollege = "Harvey Mudd";
				System.out.println(selectedCollege);
			} else if(college.size() == "small" && college.region() == "west" && college.tier() == "two") {
				selectedCollege = "Denver University";
				System.out.println(selectedCollege);
			} else if(college.size() == "small" && college.region() == "east" && college.tier() == "one") {
				selectedCollege = "Massachusetts Institute of Technology";
				System.out.println(selectedCollege);
			} else if(college.size() == "small" && college.region() == "east" && college.tier() == "two") {
				selectedCollege = "Capital University";
				System.out.println(selectedCollege);
			} else if(college.size() == "large" && college.region() == "west" && college.tier() == "one") {
				selectedCollege = "University of Wisconsin";
				System.out.println(selectedCollege);
			} else if(college.size() == "large" && college.region() == "west" && college.tier() == "two") {
				selectedCollege = "University of Oregon";
				System.out.println(selectedCollege);
			} else if(college.size() == "large" && college.region() == "east" && college.tier() == "one") {
				selectedCollege = "Penn State";
				System.out.println(selectedCollege);
			} else if(college.size() == "large" && college.region() == "east" && college.tier() == "two") {
				selectedCollege = "Syracuse";
				System.out.println(selectedCollege);
			} else {
				System.out.println("You have not selected a college!");
			}
		} while(i==1);



	}
}


