public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    private void setRadius(double radius){
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public Circle(double radius){
        this.setRadius(radius);
    }
}
