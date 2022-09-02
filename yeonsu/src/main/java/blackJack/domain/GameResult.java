package blackJack.domain;

import blackJack.domain.gamer.Dealer;
import blackJack.domain.gamer.Player;
import blackJack.domain.gamer.Players;
import blackJack.util.ConsoleOut;

import java.util.List;

public class GameResult {

    public static void FinishGame(Dealer dealer, Players players) {
        List<Player> playerList = players.currentPlayers();
        if (isDealerOverBlackJackNumber(dealer)) {
            playerList.stream().forEach(player -> {
                if (player.currentScore() <= ConsoleOut.BLACK_JACK_NUMBER) {
                    player.winGame();
                }
            });
        } // Dealer가 BlackJack보다 큰 숫자를 가질 때

        if (isDealerEqualToBlackJackNumber(dealer)) {
            playerList.stream().forEach(player -> {
                if (player.currentScore() > ConsoleOut.BLACK_JACK_NUMBER || player.currentScore() < ConsoleOut.BLACK_JACK_NUMBER) {
                    player.looseGame();
                }
            });
        } // Dealer가 BlackJack을 가질 때

        if (isDealerUnderBlackJackNumber(dealer)) {
            playerList.stream().forEach(player -> {
                if (player.currentScore() == ConsoleOut.BLACK_JACK_NUMBER || (player.currentScore() < ConsoleOut.BLACK_JACK_NUMBER && player.currentScore() > dealer.currentScore())) {
                    player.winGame();
                } else {
                    player.looseGame();
                }
            });
        } // Dealer가 BlakJack보다 낮을 때

        players.playersMoney();
        dealer.getTotalMoney(players.playersTotalMoneySum());
    }

    private static boolean isDealerUnderBlackJackNumber(Dealer dealer) {
        return dealer.currentScore() < ConsoleOut.BLACK_JACK_NUMBER;
    }

    private static boolean isDealerEqualToBlackJackNumber(Dealer dealer) {
        return dealer.currentScore() == ConsoleOut.BLACK_JACK_NUMBER;
    }

    private static boolean isDealerOverBlackJackNumber(Dealer dealer) {
        return dealer.currentScore() > ConsoleOut.BLACK_JACK_NUMBER;
    }
}
