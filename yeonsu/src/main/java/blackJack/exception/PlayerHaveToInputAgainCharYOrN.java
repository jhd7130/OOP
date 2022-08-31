package blackJack.exception;

public class PlayerHaveToInputAgainCharYOrN extends IllegalArgumentException {
    public PlayerHaveToInputAgainCharYOrN() {
    }

    public PlayerHaveToInputAgainCharYOrN(String s) {
        super(s);
    }
}
