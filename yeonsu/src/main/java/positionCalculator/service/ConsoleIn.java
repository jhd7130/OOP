package positionCalculator.service;

import java.util.Scanner;

public class ConsoleIn {

    private static Scanner scanner = new Scanner(System.in);

    public static String userInputString() {
        return scanner.nextLine();
    }
}
