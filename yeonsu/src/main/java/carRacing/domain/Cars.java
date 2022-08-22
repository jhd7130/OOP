package carRacing.domain;

import carRacing.utils.Generator;
import carRacing.utils.RandomGenerator;
import carRacing.utils.SplitStringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * Role : 자동차 리스트를 갖고 있는 일급 컬렉션 Cars
 * Responsibility : 자동차들을 불변 객체들로 유지하는 책임
 * Collaboration : Car, GameResult
 */
public class Cars {

    private List<Car> cars;
    private int gameTimes;

    public Cars(String carNames, int gameTimes) {
        carCollectionSetting(SplitStringUtil.changeString(carNames));
        this.gameTimes = gameTimes;
    }

    private void carCollectionSetting(List<String> carNames) {
        cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(Car.of(carName));
        }
    }

    // 어디까지 객체를 나눠 사용해야 하는지 판단 필요
    public void moveCars(Generator generator) {
        cars.stream().forEach(car -> car.canMove(generator));
    }

    public void gameResultPrint() {
        cars.stream().forEach(car -> System.out.println(car.toString()));
    }

    public void play() {
        for (int i = 0; i < this.gameTimes; i++) {
            moveCars(new RandomGenerator());
            gameResultPrint();
            System.out.println();
        }
    }
}
