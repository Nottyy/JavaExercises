public class Wall {
    private double width;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getArea(){
        return this.getHeight() * this.getWidth();
    }

    public Wall(){

    }

    public Wall(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }

}
