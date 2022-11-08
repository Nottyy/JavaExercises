import java.util.ArrayList;

public class Room {
    private ArrayList<Door> doors;
    private Lights lights;
    private ArrayList<Furniture> furnitureList;
    private Desk desk;

    public Room(ArrayList<Door> doors, Lights lights, ArrayList<Furniture> furnitureList) {
        this.doors = doors;
        this.lights = lights;
        this.furnitureList = furnitureList;
    }

    public void printAllFurniture() {
        System.out.println("There are " + this.furnitureList.size() + " pieces of furniture in the room:");
        for (Furniture fn : furnitureList) {
            System.out.println(fn.getName());
        }
    }

    public void turnLightsOn() {
        this.lights.turnLightsOn();
    }

    public void turnLightsOff() {
        this.lights.turnLightsOff();
    }

    public void addFurniture(Furniture furniture){
        this.furnitureList.add(furniture);
        System.out.println(furniture.getName() + " added.");
    }
}
