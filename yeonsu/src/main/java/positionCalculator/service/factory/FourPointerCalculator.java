package positionCalculator.service.factory;

import positionCalculator.domain.Pointers;

public class FourPointerCalculator implements PointersCalculator {

    @Override
    public void calculateExpression(Pointers pointers) {
        System.out.println("4개의 점으로 이루어진 도형의 넓이 입니다.");
    }
}
