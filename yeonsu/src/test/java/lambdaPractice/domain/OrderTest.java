package lambdaPractice.domain;

import lambdaPractice.service.UserOrder;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {


    
    @Test
    public void orderUsingAnonymousFunction() throws Exception {
        Order order = new Order(0);
        UserOrder userOrder = () -> true;
        assertThat(order.pushOrder(userOrder)).isEqualTo(new Order(1));
    }

    @Test
    public void orderUsingAnonymousClassTest() throws Exception {
        Order order = new Order(0);
        UserOrder userOrder = new UserOrder() {
            @Override
            public boolean addOneOrderNumber() {
                return false;
            }
        };
        assertThat(order.pushOrder(userOrder)).isEqualTo(new Order(0));
    }

}