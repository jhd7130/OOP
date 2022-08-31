package blackJack.util;

import blackJack.domain.gamer.Dealer;
import blackJack.domain.gamer.Player;
import blackJack.domain.gamer.Players;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PlayerStringUtil {

    private static String regex = "[a-zA-Z]+";

    public static List<String> stringPlayersUsingRegex(String userInput) {
        return Pattern.compile(regex).matcher(userInput).results().map(MatchResult::group).collect(Collectors.toList());
    }

    public static void GamersInfoPrint(Dealer dealer, Players players) {
        dealer.printCards();
        players.printPlayersCard();
    }
}
