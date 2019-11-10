package examReview;

public class Trail {
    private int x, y;
    @SuppressWarnings("unused")
	private String string;


    public Trail(String s) {
        x = 10;
        y = 10;

        string = s;
    }


    String met() {
        Integer product = new Integer(x * y);
        String k = product.toString();
        return k;
    }

}
