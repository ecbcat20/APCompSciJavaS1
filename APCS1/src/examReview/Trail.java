package examReview;

public class Trail {
    private int x, y;
    private String string;

    @SuppressWarnings(unused)
    public Trail(String s) {
        x = 10;
        y = 10;

        string = s;
    }

    @SuppressWarnings(unused)
    String met() {
        int product = x*y;
        String k = product.toString();
        return k;
    }

}
