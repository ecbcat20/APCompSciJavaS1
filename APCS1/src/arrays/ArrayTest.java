package arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 2, 3, 4, 5 };

        // print stuff inside array
        for (int i : arr) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }

        }
    }

}