package arrays;

public class ArrayReverse {

	public static void wrongReverse(int[] a) {
		int[] b = new int[a.length];
		
		for (int i = b.length; i >= 0; i--) {
			b[i] = a[i];
		}
		
		System.out.println();
		
		for(int i:b) {
			System.out.print(b[i] + ", ");
		}
	}
	
	

	public static void main(String[] args) {
		double rand;
		int[] arr = new int[10];

		for (int i : arr) {
			rand = Math.random() * 10;
			arr[i] = (int) rand;
		}
		
		wrongReverse(arr);

	}

}
