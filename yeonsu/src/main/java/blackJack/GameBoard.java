package blackJack;

import blackJack.domain.Deck;

public class GameBoard {

    public static void init() {
        System.out.println("GameBoard.init");
        Deck init = Deck.init();
        init.printDeck();
    }
}
