package ch.heigvd.pdl.refactoring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrdersWriterTest {
    List<Order> orders = new ArrayList<>();
    Order order111 = new Order(111);

    @BeforeEach
    public void SetupOneOrder() {
        orders.add(order111);
    }

    @Test
    void NoOrder() {
        assertEquals("{\"orders\": []}", new OrdersWriter(new ArrayList<>()).getContents());
    }

    @Test
    void OneOrder() {
        String order111 = "{\"id\": 111, \"products\": []}";
        assertEquals("{\"orders\": [" + order111 + "]}", new OrdersWriter(orders).getContents());
    }

    @Test
    void TwoOrders() {
        orders.add(new Order(222));
        String order111Json = JsonOrder111WithProduct("");
        String order222Json = "{\"id\": 222, \"products\": []}";
        assertEquals("{\"orders\": [" + order111Json + ", " + order222Json + "]}", new OrdersWriter(orders).getContents());
    }

    @Test
    void OneOrderWithOneProduct() {
        order111.addProduct(new Product("Shirt", 1, Size.M, 2.99, "TWD"));
        String order111Json = JsonOrder111WithProduct("{\"code\": \"Shirt\", \"color\": \"blue\", \"size\": \"M\", \"price\": 2.99, \"currency\": \"TWD\"}");
        assertEquals("{\"orders\": [" + order111Json + "]}", new OrdersWriter(orders).getContents());
    }

    @Test
    void OneOrderWithOneProductNoSize() {
        order111.addProduct(new Product("Pot", 2, Size.NO_SIZE, 16.50, "SGD"));
        String order111Json = JsonOrder111WithProduct("{\"code\": \"Pot\", \"color\": \"red\", \"price\": 16.5, \"currency\": \"SGD\"}");
        assertEquals("{\"orders\": [" + order111Json + "]}", new OrdersWriter(orders).getContents());
    }

    private String JsonOrder111WithProduct(String productJson) {
        return "{\"id\": 111, \"products\": [" + productJson + "]}";
    }

}
