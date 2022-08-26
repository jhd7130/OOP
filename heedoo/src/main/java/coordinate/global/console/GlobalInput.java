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
        return scanner.next();
    }

    public static void printNavigateSign(){
        System.out.println("어떤 계산기를 이용하시겠습니까? 원하는 계산기의 번호를 입력해주세요.");
        System.out.println("1. 두점 사이의 거리");
        System.out.println("2. 사각형의 면적");
        System.out.println("3. 삼각형의 면적");
    }

}
