package blackJack.domain.wrapper;

public enum Shape {
    HEART("하트"), DIAMOND("다이아몬드"), SPADE("스페이드"), CLOVER("클로버");

    private String cardShape;

    Shape(String cardShape) {
        this.cardShape = cardShape;
    }


}
