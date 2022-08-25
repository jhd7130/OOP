package positionCalculator.service.factory;

import positionCalculator.domain.Pointers;

public class TwoPointerCalculator implements PointersCalculator {
    @Override
    public void calculateExpression(Pointers pointers) {
        System.out.println("2개의 점으로 이루어진 선의 넓이 입니다.");
    }
}
