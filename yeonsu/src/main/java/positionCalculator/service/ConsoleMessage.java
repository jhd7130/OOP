package positionCalculator.service;

public enum ConsoleMessage {
    GAME_START("좌표를 입력하세요");

    private String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(GAME_START.message);
    }
}
