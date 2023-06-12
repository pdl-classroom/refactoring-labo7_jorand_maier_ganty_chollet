package ch.heigvd.pdl.refactoring;

public enum Color {
    NO_SIZE("no color"),
    BLUE("blue"),
    RED("red"),
    YELLOW("yellow");

    private final String value;

    private Color(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
