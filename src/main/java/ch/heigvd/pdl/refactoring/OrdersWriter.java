package ch.heigvd.pdl.refactoring;

public class OrdersWriter {

    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuilder sb = new StringBuilder("{\"orders\": [");

        for (int i = 0; i < orders.getOrdersCount(); i++) {
            Order order = orders.getOrder(i);
            sb.append("{");
            sb.append("\"id\": ");
            sb.append(order.getOrderId());
            sb.append(", ");
            sb.append("\"products\": [");
            for (int j = 0; j < order.getProductsCount(); j++) {
                Product product = order.getProduct(j);

                sb.append("{");
                sb.append("\"code\": \"");
                sb.append(product.getCode());
                sb.append("\", ");
                sb.append("\"color\": \"");
                sb.append(getColorFor(product));
                sb.append("\", ");

                if (product.getSize() != Product.SIZE_NOT_APPLICABLE) {
                    sb.append("\"size\": \"");
                    sb.append(getSizeFor(product));
                    sb.append("\", ");
                }

                sb.append("\"price\": ");
                sb.append(product.getPrice());
                sb.append(", ");
                sb.append("\"currency\": \"");
                sb.append(product.getCurrency());
                sb.append("\"}, ");
            }

            if (order.getProductsCount() > 0) {
                sb.delete(sb.length() - 2, sb.length());
            }

            sb.append("]");
            sb.append("}, ");
        }

        if (orders.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }

    private String getSizeFor(Product product) {
        return switch (product.getSize()) {
            case 1 -> "XS";
            case 2 -> "S";
            case 3 -> "M";
            case 4 -> "L";
            case 5 -> "XL";
            case 6 -> "XXL";
            default -> "Invalid Size";
        };
    }

    private String getColorFor(Product product) {
        return switch (product.getColor()) {
            case 1 -> "blue";
            case 2 -> "red";
            case 3 -> "yellow";
            default -> "no color";
        };
    }
}
