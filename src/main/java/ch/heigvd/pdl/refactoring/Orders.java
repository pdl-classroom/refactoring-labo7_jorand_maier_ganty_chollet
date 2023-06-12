package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public int getOrdersCount() {
        return orderList.size();
    }

    public Order getOrder(int i) {
        return orderList.get(i);
    }

}
