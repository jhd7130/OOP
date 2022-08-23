package fuelInjection.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RentCompanyTest {

    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception {
        RentCompany rentCompany = RentCompany.create();
        rentCompany.addCar(new Sonata(150));
        rentCompany.addCar(new K5(260));
        rentCompany.addCar(new Sonata(120));
        rentCompany.addCar(new Avante(300));
        rentCompany.addCar(new K5(390));

        String generateReport = rentCompany.generateReport();
        assertThat(generateReport).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터" + NEWLINE
        );
    }

    @DisplayName("객체 상속 시 객체 비교")
    @Test
    public void sameObjectTest() throws Exception {
        Car car1 = new Sonata(150);
        Car car2 = new Sonata(150);
        assertThat(car1).isEqualTo(car2);
    }
}