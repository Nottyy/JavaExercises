public class Desk extends Furniture{
    private int computers;
    private boolean hasShelves;

    private int degrees;

    public Desk(String name, int size, String color, int computers, boolean hasShelves) {
        super(name, size, color);
        this.computers = computers;
        this.hasShelves = hasShelves;
    }

    public void adjustDesk(int degrees){
        if (degrees < 0 || degrees > 90){
            System.out.println("Degrees must be between 0-90.");
        }
        else {
            System.out.println("Desk adjust at " + degrees + " degrees.");
        }
    }
}
