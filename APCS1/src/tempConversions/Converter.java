package tempConversions;

public class Converter {

    private double d;
    static double converted;
    public static String convertedString;

    public Converter(double d) {
        this.d = d;
    }

    double convert() { // F to C only
        converted = ((d - 32) * 5 / 9);
        convertedString = String.valueOf(converted);
        FrameCreator.entryField.setText((convertedString) + " Degrees Celsius");
        return converted;
    }

}