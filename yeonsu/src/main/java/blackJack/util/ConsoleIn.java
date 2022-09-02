package blackJack.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleIn {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String UserInputNames() {
        String userNames = "";
        try {
            userNames = bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return userNames;
    }


    public static int PlayerMoneyInput() {
        String playerMoneyString = "";
        try {
            playerMoneyString = bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Integer.parseInt(playerMoneyString);
    }

    public static Character MoreCardOrNot() {
        String answer = "";
        try {
            answer = bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return answer.charAt(0);
    }

}
