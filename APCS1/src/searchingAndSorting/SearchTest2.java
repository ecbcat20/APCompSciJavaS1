package searchingAndSorting;

public class SearchTest2 {

	public static void main(String[] args) {
		double[] toSearch = new double[100];

		for (int i = 0; i < toSearch.length; i++) {
			toSearch[i] = (int) (Math.random() * 1000);
		}
		display(toSearch);
		System.out.println(linearSearch(toSearch, 14.0));
	}

	public static void display(double[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}
	}

	public static boolean linearSearch(double[] theList, double key) {
		int count = 0;
		for (double item : theList) {
			count++;
			if (item == key) {
				System.out.println(count);
				return true;
			}
		}
		return false;
	}

}
