package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStart {
	static ArrayList<String> animals = new ArrayList<>();

	public static void fillArrayList() {
		String cat = "cat";
		String bird = "bird";
		String hamster = "hamster";
		
		animals.add(hamster);
		animals.add(0, cat);
		animals.add(0, bird);
		
		System.out.println(animals);

		Collections.sort(animals);

		for (int i = 0; i < animals.size(); i++) {
			if ((animals.get(i)).charAt(0) > "dog".charAt(0)) {
				animals.add(i, "dog");
				i = animals.size()-1;
			}
		}
		
		System.out.println(animals);

		animals.add("iguana");
		Collections.sort(animals);

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).charAt(0) > "fish".charAt(0)) {
				animals.add(i, "fish");
				i = animals.size()-1;
			}
		}
		
		System.out.println(animals);

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).charAt(0) > "ferret".charAt(0)) {
				animals.add(i, "ferret");
				i = animals.size()-1;
			}
		}

		animals.add("turtle");
		System.out.println(animals);

	}

	public static void printAllElements() {

		
		for (String s : animals) {
			System.out.print(s + " ");
		}
	}

	public static void printElements() {
		System.out.println(animals.get(0));
		System.out.println(animals.get(animals.size()-1));
		System.out.println(animals.get(3));
		System.out.println(animals.indexOf("fish"));
	}

	public static void removeElements() {
		animals.remove(0);
		animals.remove(animals.size()-1);
		animals.remove(5);

		animals.set(animals.indexOf("dog"), "puppy");
		System.out.println(animals);
		animals.toString();
		animals.clear();
	}

	public static void main(String[] args) {
		fillArrayList();
		animals.toString();

		printAllElements();
		printElements();
		System.out.println(animals);
		removeElements();
		
		
	}
}
