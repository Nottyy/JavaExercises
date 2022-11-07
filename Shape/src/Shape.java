public class Shape {
    private int x;
    private int y;
    private static int qwe;

    public Shape(int x, int y){
        this.x  = x;
        this.y = y;
    }

    public int calculateArea(){
        return this.x * this.y;
    }

    public static int areaCalc(){
        var s = qwe;
        return 5;
    }

    public void printName(){
        System.out.println("Shape");
    }
}
