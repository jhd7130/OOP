package coordinate.global;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/

public enum CalculatorType {
    LINE(1), SQUARE(2), TRIANGLE(3);

    public int label;

    CalculatorType(int label) {
        this.label = label;
    }
    public static CalculatorType valueOfLabel(int label) {
        for (CalculatorType e : values()) {
            if (e.label == label) {
                return e;
            }
        }
        return null;
    }
}
