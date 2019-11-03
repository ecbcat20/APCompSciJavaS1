package examReview;

public class Trail {
    private int x, y;
    private String string;
    public Trail(String s) {
        x = 10;
        y = 10;

        string = s;

    }

    String met() {
        int product = x*y;
        String k = product.toString();
        return (k);
    }



}
