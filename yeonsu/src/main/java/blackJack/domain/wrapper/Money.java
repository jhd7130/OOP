package blackJack.domain.wrapper;

import blackJack.infra.ConsoleOut;
import blackJack.infra.exception.MoneyOutOfBounds;

public class Money {

    private int money;

    public Money(int money) {
        if (money < 0) {
            throw new MoneyOutOfBounds(ConsoleOut.MONEY_EXCEPTION_MESSAGE);
        }
        this.money = money;
    }

    public void batting(int money) {
        this.money += money;
    }
}
