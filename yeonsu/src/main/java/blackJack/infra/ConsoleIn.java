package blackJack.infra;

import java.util.Scanner;

public class ConsoleIn {

    private static Scanner scanner = new Scanner(System.in);

    public static String PlayerInput() {
        return scanner.nextLine();
    }

    public static String OneMoreCardOrNot() {
        return scanner.nextLine();
    }

    public static int UserInputBattingMoney() {
        return scanner.nextInt();
    }
}
