package blackJack.domain;

import blackJack.infra.ConsoleOut;

import java.util.List;

public class QuestionToGamers {

    public static void question(Gamer gamer) {
        if (gamer instanceof Player) {
            System.out.println(gamer.currentName() + ConsoleOut.ONE_MORE_CARD_MESSAGE); // message
        }
        if (gamer instanceof Dealer) {

        }
    }
}
