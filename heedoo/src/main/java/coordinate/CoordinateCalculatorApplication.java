package coordinate;

import coordinate.global.CalculatorType;
import coordinate.global.CorrdinateCalculatorFactory;
import coordinate.global.console.GlobalInput;

public class CoordinateCalculatorApplication {
    public static void main(String[] args) {
        GlobalInput.printNavigateSign();
        int num = GlobalInput.inputCalculatorType();
        CoordinateCalculator coordinateCalculator = CorrdinateCalculatorFactory.create(CalculatorType.valueOfLabel(num));
        System.out.println("좌표입력");

        String input = GlobalInput.inputCoordinates();
        coordinateCalculator.print(input);

        // 좌표 입력 후 그림 출력 -->
    }
}
