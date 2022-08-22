package carRacing.utils;

public enum ConsoleOutMessage {

    GAME_START_MESSAGE("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."),
    NUMBER_OF_GAME_TIMES_MESSAGE("시도할 회수는 몇회인가요?");

    private String message;

    ConsoleOutMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(this.message);
    }
}
