package carRacing.utils;

import java.util.Scanner;

public class ConsoleIn {

    private static Scanner scanner = new Scanner(System.in);

    public static String GameCarNames() {
        return scanner.nextLine();
    }

    public static int GameTimes() {
        return scanner.nextInt();
    }
}

