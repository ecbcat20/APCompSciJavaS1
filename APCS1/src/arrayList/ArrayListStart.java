package arrayList;

import java.util.ArrayList;

public class ArrayListStart {
	static ArrayList<String> animals = new ArrayList<>();

	
	public static void addToList(ArrayList<String> arr, String s, int pos) {
		arr.add(arr.get(pos));
		arr.add(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addToList("bird");
		

	}

}
