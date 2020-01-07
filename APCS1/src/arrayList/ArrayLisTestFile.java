package arrayList;

import java.util.ArrayList;

public class ArrayLisTestFile {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0);

        // these 4 values cause the code to crash when trying to remove all negative
        // values. I don't know why, but they do.
        list.add(-1);
        list.add(-2);
        list.add(-3);
        list.add(-4);

        System.out.println(list);

        // remove negatives, does not work because negative numbers are in consecutive
        // positions
        int n = list.size(), i = 0;

        while (i < n) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
            i++;
        }

        System.out.println(list);

    }

}