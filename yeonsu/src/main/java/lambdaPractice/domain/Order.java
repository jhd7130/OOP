package lambdaPractice.domain;

import lambdaPractice.service.UserOrder;

public class Order {

    private int orderNumber = 0;


    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Order pushOrder(UserOrder userOrder) {
        if (userOrder.addOneOrderNumber() == true) {
            orderNumber++;
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        return orderNumber == order.orderNumber;
    }

    @Override
    public int hashCode() {
        return orderNumber;
    }
}
