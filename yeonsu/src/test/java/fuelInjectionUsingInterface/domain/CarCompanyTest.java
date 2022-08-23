package fuelInjectionUsingInterface.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarCompanyTest {

    @Test
    public void carMemberTest() throws Exception {
        CarCompany carCompany = CarCompany.create();
        carCompany.addCar("Genesis", 350);
        List<RentCar> rentCars = carCompany.currentCanUseCarList();

        RentCar genesis = Car.from("Genesis", 350);
        assertThat(rentCars).contains(genesis);
    }

}