package carRacing.domain;

import java.util.ArrayList;
import java.util.List;

/*
 * Role : 자동차 리스트를 갖고 있는 일급 컬렉션 Cars
 * Responsibility : 자동차들을 불변 객체들로 유지하는 책임
 * Collaboration : Car, GameResult
 */
public class Cars {

    private List<Car> cars;

    public Cars(List<String> carNames) {
        cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(Car.of(carName));
        }
    }
}
