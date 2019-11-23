package kickboxing;

public class Kickboxer {
    private String wclass = "";
    

    public Kickboxer() {
    }

    // weight class             from to(not inclusive)
    // -----------------------------------------------
    // Fly Weight               0 112
    // Super Fly Weight         112 115
    // Bantam Weight            115 118
    // Super Bantam Weight      118 122
    // Feather Weight           122 126
    // Super Feather Weight     126 130
    // Light Weight             130 135
    // Super Light Weight       135 140
    // Welter Weight            140 147
    // Super Welter Weight      147 154
    // Middle Weight            154 160
    // Super Middle Weight      160 167
    // Light Heavy Weight       167 174
    // Super Light Heavy Weight 174 183
    // Cruiser Weight           183 189
    // Super Cruiser Weight     189 198
    // Heavy Weight             198 209
    // Super Heavy Weight       209

    String qualifyWeight(String[] wc, int[] limits, int weight) {

        for(int i : limits) {
            
        }

        if(weight <limits[1]) {
            wclass = wc[1];
        }

        return wclass;
    }
}