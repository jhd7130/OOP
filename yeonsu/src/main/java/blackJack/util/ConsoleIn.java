package blackJack.util;

import java.util.Scanner;

public class ConsoleIn {
    private static Scanner scanner = new Scanner(System.in);

    public static String UserInputNames() {
        return scanner.nextLine();
    }

    public static int PlayerMoneyInput() {
        return scanner.nextInt();
    }
}
