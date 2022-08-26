package blackJack.infra.exception;

public class CardNumberException extends IllegalArgumentException {
    public CardNumberException() {
    }

    public CardNumberException(String s) {
        super(s);
    }
}
