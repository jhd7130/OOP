package positionCalculator.utils;

import java.util.Scanner;

public class ConsoleIn {

    private static Scanner scanner = new Scanner(System.in);

    public static String userInput() {
        return scanner.nextLine();
    }
}
