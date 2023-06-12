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

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\"code\": \"");
        sb.append(getCode());
        sb.append("\", \"color\": \"");
        sb.append(color);
        sb.append("\", ");

        if (size != Size.NO_SIZE) {
            sb.append("\"size\": \"");
            sb.append(size);
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", \"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");

        return sb.toString();

    }

}
