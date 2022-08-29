package blackJack.infra;

public enum ConsoleOutMessage {

    GAME_INIT_MESSAGE("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");

    private String message;

    ConsoleOutMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(this.message);
    }
}
