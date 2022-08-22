package carRacing.utils;

public class PositionToDashString {

    public static String resultDash(int times) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < times; i++) {
            stringBuffer.append("-");
        }
        return stringBuffer.toString();
    }
}
