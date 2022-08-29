package blackJack.infra.exception;

public class MoneyOutOfBounds extends IllegalArgumentException {
    public MoneyOutOfBounds() {
    }

    public MoneyOutOfBounds(String s) {
        super(s);
    }
}
