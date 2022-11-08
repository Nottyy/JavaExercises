public class Door extends Furniture {
    protected boolean isOpened;

    public Door(String name, int size, String color) {
        super(name, size, color);
        this.isOpened = false;
    }

    public void openDoor() {
        this.isOpened = true;
        printMsg(true);
    }

    public void closeDoor(){
        this.isOpened = false;
        printMsg(false);
    }

    public void printMsg(boolean isOpened){
        System.out.println("The door is " + (isOpened ? "opened." : "closed."));
    }
}
