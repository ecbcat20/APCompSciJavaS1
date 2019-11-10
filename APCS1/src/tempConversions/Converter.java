package tempConversions;

public class Converter {

    private double d;
    static double converted;
    public static String convertedString;

    public Converter(double d) {
        this.d = d;
    }

    double FtoCconvert() { // F to C only
        converted = ((d - 32) * 5 / 9);
        convertedString = String.valueOf(converted);
        FrameCreator.entryField.setText((convertedString) + "°C");
        return converted;
    }

    double CtoFConvert() { // C to F only
        converted = ((d * 9 / 5) + 32);
        convertedString = String.valueOf(converted);
        FrameCreator.entryField.setText((convertedString) + "°F");
        return converted;
    }

}