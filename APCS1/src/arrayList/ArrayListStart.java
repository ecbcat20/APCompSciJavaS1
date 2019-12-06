package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStart {
	static ArrayList<String> animals = new ArrayList<>();

	public static void fillArrayList() {
		animals.add("hamster");
		animals.add(0, "cat");
		animals.add(0, "bird");

		Collections.sort(animals);

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).charAt(0) > "dog".charAt(0)) {
				animals.add(i, "dog");
			}
		}

		animals.add("iguana");
		Collections.sort(animals);

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).charAt(0) > "fish".charAt(0)) {
				animals.add(i, "fish");
			}
		}

		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i).charAt(0) > "ferret".charAt(0)) {
				animals.add(i, "ferret");
			}
		}

		animals.add("turtle");

	}

	public static void printAllElements() {

		String[] animals2 = new String[animals.size()];
		animals2 = (String[]) animals.toArray();

		for (String s : animals2) {
			System.out.print(s);
		}
	}

	public static void printElements() {
		System.out.println(animals.get(0));
		System.out.println(animals.get(animals.size()));
		System.out.println(animals.get(3));
		System.out.println(animals.indexOf("fish"));
	}

	public static void removeElements() {
		animals.remove(0);
		animals.remove(animals.size());
		animals.remove(5);

		animals.set(animals.indexOf("dog"), "puppy");
		animals.toString();
		animals.clear();
		animals.toString();
	}

	public static void main(String[] args) {
		fillArrayList();
		animals.toString();

		printAllElements();
		printElements();
		removeElements();
	}
}
