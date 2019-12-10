package arrayList;

import java.util.ArrayList;

public class Permutation {

	public static ArrayList<Integer> permutate(ArrayList<Integer> l) {
		ArrayList<Integer> list2 = l;
		int rand;

		for (int i = 0; i < 10; i++) {
			rand = (int) (Math.random() * 10) + 0;
			list2.add(l.get(rand));
			l.remove(l.get(rand));
		}

		return list2;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			list1.add(i);
		}

		System.out.println("Random Permutation Generator");
		System.out.println("\n");
		
		System.out.println("List 1 " + permutate(list1));
		System.out.println("List 2 " + permutate(list1));
		System.out.println("List 3 " + permutate(list1));
		System.out.println("List 4 " + permutate(list1));
		System.out.println("List 5 " + permutate(list1));
		System.out.println("List 6 " + permutate(list1));
		System.out.println("List 7 " + permutate(list1));
		System.out.println("List 8 " + permutate(list1));
		System.out.println("List 9 " + permutate(list1));
		System.out.println("List 10 " + permutate(list1));
	}

}
