package kickboxing;

public class Launcher {

    // • Initialize an integer array and a string array to store weight limit and
    // weight class
    // • Generate a random number between 112-209 inclusive, display the number
    // • Call the qualifyWeight method to determine the weight class
    // • Then display the weight class.\

    // initialize arrays
    static String[] wc = new String[20];
    static int[] wlimit = new int[20];

    //initialize random number to be used as weight
    static double rand = Math.random() * 209;
    static int w = (int) rand;
    static Kickboxer boxer = new Kickboxer();

    public static void main(String[] args) {

        wc[0] = "Flyweight";
        wc[1] = "Super Flyweight";
        wc[2] = "Bantam Weight";
        wc[3] = "Super Bantam Weight";
        wc[4] = "Feather Weight";
        wc[5] = "Super Feather Weight";
        wc[6] = "Light Weight";
        wc[7] = "Super Light Weight";
        wc[8] = "Welter Weight";
        wc[9] = "Super Welter Weight";
        wc[10] = "Middle Weight";
        wc[11] = "Super Middle Weight";
        wc[12] = "Light Heavy Weight";
        wc[13] = "Super Light Heavy Weight";
        wc[14] = "Cruiser Weight";
        wc[15] = "Super Cruiser Weight";
        wc[16] = "Heavy Weight";
        wc[17] = "Super Heavy Weight";

        wlimit[0] = 112;
        wlimit[1] = 115;
        wlimit[2] = 118;
        wlimit[3] = 122;
        wlimit[4] = 116;
        wlimit[5] = 130;
        wlimit[6] = 135;
        wlimit[7] = 140;
        wlimit[8] = 147;
        wlimit[9] = 154;
        wlimit[10] = 160;
        wlimit[11] = 167;
        wlimit[12] = 174;
        wlimit[13] = 183;
        wlimit[14] = 189;
        wlimit[15] = 198;
        wlimit[16] = 209;
        wlimit[17] = 210;

        boxer.qualifyWeight(wc, wlimit, w);

    }

}