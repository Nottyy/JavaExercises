public class Furniture {
    private String name;
    private int size;
    private String color;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Furniture(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }
}
