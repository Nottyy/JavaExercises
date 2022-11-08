import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lights lights = new Lights(5, 10, "green");
        ArrayList<Door> doors = new ArrayList<Door>();
        doors.add(new MetalDoor("MetalDoor", 10, "red"));
        doors.add(new MetalDoor("MetalDoor", 5, "yellow"));
        doors.add(new DecorDoor("DecorDoor", 1, "red"));
        doors.add(new DecorDoor("DecorDoor", 3, "black"));

        ArrayList<Furniture> furnitureList = new ArrayList<Furniture>();
        furnitureList.add(new Desk("CompDesk", 5, "red", 5, false));
        furnitureList.add(new Sofa("LargeSofa", 22, "green", true));

        Room room = new Room(doors, lights,furnitureList);

        room.printAllFurniture();
        room.turnLightsOn();
        room.turnLightsOff();
        room.turnLightsOn();

        room.addFurniture(new DecorDoor("SmallDecorDoor", 4, "red"));
        room.printAllFurniture();
    }
}