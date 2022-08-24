package positionCalculator.utils;

public enum ConsoleOutMessage {
    GAME_START_MESSAGE("좌표를 입력하세요.\n");

    private String message;

    ConsoleOutMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.print(GAME_START_MESSAGE.message);
    }
}
