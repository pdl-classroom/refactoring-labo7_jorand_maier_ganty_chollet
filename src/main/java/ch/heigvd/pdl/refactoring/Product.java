package ch.heigvd.pdl.refactoring;

public class Product {

    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public Product(String code, Color color, double price, String currency) {
        this(code, color, Size.NO_SIZE, price, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\"code\": \"");
        sb.append(code);
        sb.append("\", \"color\": \"");
        sb.append(color);
        sb.append("\", ");

        if (size != Size.NO_SIZE) {
            sb.append("\"size\": \"");
            sb.append(size);
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(price);
        sb.append(", \"currency\": \"");
        sb.append(currency);
        sb.append("\"}, ");

        return sb.toString();

    }

}
