package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("{\"id\": ");
        sb.append(id);
        sb.append(", \"products\": [");
        for (Product product : products) {
            sb.append(product);
        }

        if (!products.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}, ").toString();
    }
}
