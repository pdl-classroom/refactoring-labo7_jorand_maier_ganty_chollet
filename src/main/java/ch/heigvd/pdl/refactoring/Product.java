package ch.heigvd.pdl.refactoring;

public class Product {
    
    private String code;
    private int color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, int color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }
    public Product(String code, int color, double price, String currency) {
       this(code, color, Size.NO_SIZE, price, currency);
    }

    public String getCode() {
        return code;
    }

    public int getColor() {
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
        sb.append(getColorFor(this));
        sb.append("\", ");

        if (getSize() != Product.SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(getSizeFor(this));
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", \"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");

        return sb.toString();

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