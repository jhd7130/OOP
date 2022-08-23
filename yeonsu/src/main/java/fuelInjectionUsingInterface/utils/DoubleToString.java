package fuelInjectionUsingInterface.utils;

import java.text.DecimalFormat;

public class DoubleToString {
    public static String changeType(double givenNumber) {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        return decimalFormat.format(givenNumber);
    }
}
