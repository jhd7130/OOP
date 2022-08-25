package positionCalculator.service.factory;

import positionCalculator.domain.Pointers;

@FunctionalInterface
public interface PointersCalculator {
    void calculateExpression(Pointers pointers);
}
