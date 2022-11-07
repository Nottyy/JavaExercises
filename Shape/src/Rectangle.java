public class Rectangle extends Shape{
    private int widght;
    private int height;

    public Rectangle(int x, int y) {
        this(x, y, 0, 0);
    }

    public Rectangle(int x, int y, int width, int height){
        super(x,y);
        this.widght = width;
        this.height = height;
    }


    @Override
    public int calculateArea() {
        return this.widght * this.height;
    }

    @Override
    public void printName() {
        System.out.println("Rect");
    }
}
