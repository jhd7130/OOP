package coordinate.global.console;

import java.util.Scanner;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class GlobalInput {
    public static final Scanner scanner = new Scanner(System.in);

    public static int  inputCalculatorType(){
        return scanner.nextInt();
    }

    public static String inputCoordinates(){
        return scanner.nextLine();
    }
}
