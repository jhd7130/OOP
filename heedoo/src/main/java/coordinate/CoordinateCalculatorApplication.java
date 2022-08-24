package coordinate;

import coordinate.global.CalculatorType;
import coordinate.global.CorrdinateCalculatorFactory;
import coordinate.global.console.GlobalInput;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class CoordinateCalculatorApplication {
    public static void main(String[] args) {
        System.out.println("어떤 계산기를 이용하시겠습니까? 원하는 계산기의 번호를 입력해주세요.");
        System.out.println("1. 두점 사이의 거리");
        System.out.println("2. 사각형의 면적");
        System.out.println("3. 삼각형의 면적");
        int num = GlobalInput.inputCalculatorType();
        CoordinateCalculator coordinateCalculator = CorrdinateCalculatorFactory.create(CalculatorType.valueOfLabel(num));
    }
}
