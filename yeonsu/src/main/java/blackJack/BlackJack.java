package blackJack;

import blackJack.domain.Deck;
import blackJack.domain.GameResult;
import blackJack.domain.gamer.Dealer;
import blackJack.domain.gamer.Players;
import blackJack.util.ConsoleIn;
import blackJack.util.ConsoleOutMessage;
import blackJack.util.GamerStringUtil;

public class BlackJack {

    public static void Init() {
        ConsoleOutMessage.GAME_START_MESSAGE.print();
        Deck deck = Deck.getInstance();
        Players players = Players.from(GamerStringUtil.stringPlayersUsingRegex(ConsoleIn.UserInputNames()));// Setting Players
        Dealer dealer = Dealer.getInstance();
        GamerStringUtil.GamersInfoPrint(dealer, players);

        // GetCard and ShowCard
        players.playerGetMoreCards();
        dealer.getMoreCardOrNot();
        GamerStringUtil.GamersInfoPrintIncludeResult(dealer, players);

        // Game Result and Finish
        ConsoleOutMessage.GAME_FINISH_MESSAGE.print();
        GameResult.FinishGame(dealer, players);
    }
}
