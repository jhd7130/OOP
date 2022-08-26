package blackJack.domain.wrapper;

import java.util.Arrays;

public enum Shape {
    HEART("HEART"), SPADE("SPADE"), DIAMOND("DIAMOND"), CLOVER("CLOVER");

    private String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String currentShape() {
        return shapeName;
    }
}
