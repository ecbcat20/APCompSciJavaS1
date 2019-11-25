package kickboxing;

public class Kickboxer {

    static String[] wc = { "Fly Weight", "Super Fly Weight", "Bantam Weight", "Super Bantam Weight", "Feather Weight",
            "Super Feather Weight", "Light Weight", "Super Feather Weight", "Light Weight", "Super Light Weight",
            "Welter Weight", "Super Welter Weight", "Middle Weight", "Super Middle Weight", "Light Heavy Weight",
            "Super Light Heavy Weight", "Cruiser Weight", "Super Cruiser Weight", "Heavy Weight",
            "Super Heavy Weight" };

    static int[] limits = { 0, 112, 115, 118, 122, 126, 130, 135, 140, 147, 154, 160, 167, 174, 183, 189, 198, 209 };

    static int w = (int) (Math.random() * 98 + 112);

    public static void main(String[] args) {
        System.out.println(w);
        System.out.println(qualifyWeight(wc, limits, w));
    }

    public static String qualifyWeight(String[] wc, int[] limits, int weight) {
        for (int i = 1; i < limits.length; i++) {
            if (weight < limits[i]) {
                return wc[i - 1];
            }
        }

        return null;
    }
}
